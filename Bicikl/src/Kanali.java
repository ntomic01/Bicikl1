public class Kanali {

    private String nazivKanala;


    public Kanali(String nazivKanala) {
        this.nazivKanala = nazivKanala;
    }

    public String getNazivKanala() {
        return nazivKanala;
    }

    public void setNazivKanala(String nazivKanala) {
        this.nazivKanala = nazivKanala;
    }

    @Override
    public String toString() {
        return "Kanali{" +
                "nazivKanala='" + nazivKanala + '\'' +
                '}';
    }
}
