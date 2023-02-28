package prevozna_sredstva;

public class Automobil extends MotornoVozilo implements HibridnoVozilo {

    private RezimRada rezimRada;

    private int procenatBaterije;

    public Automobil(String prozvodjac, String model, int godinaProzivodnje, int brojMesta) {
        super(prozvodjac, model, godinaProzivodnje, brojMesta);
        this.rezimRada = RezimRada.regularan;
        this.procenatBaterije = 100;
    }

    @Override
    public void produziRegistraciju() {

    }

    @Override
    public void obaviServis() {

    }

    @Override
    public RezimRada trenutniRezim() {
        return rezimRada;
    }

    @Override
    public void promeniRezim() {
        if(rezimRada == RezimRada.elektricni) {
            rezimRada = RezimRada.regularan;
        } else {
            rezimRada = RezimRada.elektricni;
        }
    }

    @Override
    public int vratiProcenatBaterije() {
        return procenatBaterije;
    }

    @Override
    public void dopuniBateriju(int procenat) {
        this.procenatBaterije += procenat;
    }

    @Override
    public void predji(int x) {
        // ako je rezim ELEKTRICNI umanjujem bateriju za 10%
        if(rezimRada == RezimRada.elektricni) {
            this.procenatBaterije = this.procenatBaterije - 10;
        }
        super.predji(x); // pozovi metodu iz nad klase
    }

}
