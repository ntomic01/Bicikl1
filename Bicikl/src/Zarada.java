public class Zarada {

    public int plata;

    public TipRadnika tipRadnika;

    public Radnik radnik;


    public Zarada(int plata, TipRadnika tipRadnika) {
        this.plata = plata;
        this.tipRadnika = tipRadnika;
    }

    public int getPlata() {
        return plata;
    }

    public void setPlata(int plata) {
        this.plata = plata;
    }

    public TipRadnika getTipRadnika() {
        return tipRadnika;
    }

    public void setTipRadnika(TipRadnika tipRadnika) {
        this.tipRadnika = tipRadnika;
    }

    public boolean jeInzenjer() {
        return getPlata() >= 50000;
    }

    public int povecajPlatu(Radnik radnik){

        if(tipRadnika == TipRadnika.elektrotehnicar){
            System.out.println(plata + 20000);
        }

        else if(tipRadnika == TipRadnika.programer) {
            System.out.println(plata + 40000);
        }

        else{
            return plata;
        }

        return 0;
    }







}



