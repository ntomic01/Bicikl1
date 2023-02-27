public class Radnik extends Zarada{

    public String ime;
    public String prezime;
    public TipRadnika type;

    public Radnik(int plata, String ime, String prezime, TipRadnika type) {
        super(plata, type);
        this.ime = ime;
        this.prezime = prezime;
        this.type = type;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    @Override
    public String toString() {
        return "Radnik{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", tipPosla=" + tipRadnika +
                ", plata=" + plata +
                '}';
    }
}
