package prevozna_sredstva;

public class Bicikl extends PrevoznoSredstvo implements HibridnoVozilo {

    private RezimRada rezimRada;

    private int procenatBaterije;

    public Bicikl(String prozvodjac, String model, int godinaProzivodnje, int brojMesta) {
        super(prozvodjac, model, godinaProzivodnje, brojMesta);
        rezimRada = RezimRada.regularan;
        procenatBaterije = 100;
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
        // ako je rezim ELEKTRICNI umanjujem bateriju za 5%
        if(rezimRada == RezimRada.elektricni) {
            this.procenatBaterije = this.procenatBaterije - 5;
        }
        super.predji(x); // pozovi metodu iz nad klase
    }

}
