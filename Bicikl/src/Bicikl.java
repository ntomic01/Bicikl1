import java.util.Scanner;
public abstract class Bicikl  {

    public int zupcanik;
    public int brzina;
    public String bojaSedista;

    public Bicikl(int zupcanik, int brzina, String bojaSedista) {
        this.zupcanik = zupcanik;
        this.brzina = brzina;
        this.bojaSedista = bojaSedista;
    }

    public int getZupcanik() {
        return zupcanik;
    }

    public void setZupcanik(int zupcanik) {
        this.zupcanik = zupcanik;
    }

    public int getBrzina() {
        return brzina;
    }

    public void setBrzina(int brzina) {
        this.brzina = brzina;
    }

    public String getBojaSedista() {
        return bojaSedista;
    }

    public void setBojaSedista(String bojaSedista) {
        this.bojaSedista = bojaSedista;
    }

    public abstract int povecajBrzinu(int povecajBrzinu);

    public abstract int stisniKocnicu(int smanjiBrzinu);

    @Override
    public String toString() {
        return "Bicikl{" +
                "zupcanik=" + zupcanik +
                ", brzina=" + brzina +
                ", bojaSedista='" + bojaSedista + '\'' +
                '}';
    }
}
