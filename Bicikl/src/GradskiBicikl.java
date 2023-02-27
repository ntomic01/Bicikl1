public class GradskiBicikl extends Bicikl {

   private int visinaSedista;

    public GradskiBicikl (int zupcanik, int brzina, String bojaSedista,int visinaSedista) {
        super(zupcanik, brzina, bojaSedista);
        this.visinaSedista = visinaSedista;
    }

    public int getVisinaSedista() {
        return visinaSedista;
    }

    public void setVisinaSedista(int visinaSedista) {
        this.visinaSedista = visinaSedista;
    }


    @Override
    public int povecajBrzinu(int povecajBrzinu) {
        brzina = brzina + 2;
        return brzina;
    }

    @Override
    public int stisniKocnicu(int smanjiBrzinu) { // abstraktna metoda, u abstraktnoj klasi ide samo uvod, logika u svakoj klasi posebno.. ovde brzinu smanjujem za 2 na sat
        brzina = brzina - 2;
        return brzina;
    }

    @Override
    public String toString() {
        return "GradskiBicikl{" +
                "visinaSedista=" + visinaSedista +
                ", zupcanik=" + zupcanik +
                ", brzina=" + brzina +
                ", bojaSedista='" + bojaSedista + '\'' +
                '}';
    }
}
