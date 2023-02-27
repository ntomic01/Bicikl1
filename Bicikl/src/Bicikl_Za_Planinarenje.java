public class Bicikl_Za_Planinarenje extends Bicikl{

    public int visinaSedista;

    public Bicikl_Za_Planinarenje(int zupcanik, int brzina, int pocetnaVisina, String bojaSedista) {
        super(zupcanik, brzina, bojaSedista);
        this.visinaSedista = pocetnaVisina;
    }


    public void setVisinaSedista(int novaVisina){
        visinaSedista = novaVisina;
    }


    @Override
    public int povecajBrzinu(int povecajBrzinu) {
        brzina = brzina + 1;
        return povecajBrzinu;
    }


    @Override
    public int stisniKocnicu(int smanjiBrzinu) { // ovde brzinu smanjujem za 1 na sat... na osnovu abstraktne metode u klasi bicikl
        brzina = brzina - 1;
        return brzina;
    }

    @Override
    public String toString() {
        return "Bicikl_Za_Planinarenje{" +
                "visinaSedista=" + visinaSedista +
                ", zupcanik=" + zupcanik +
                ", brzina=" + brzina +
                ", bojaSedista='" + bojaSedista + '\'' +
                '}';
    }
}
