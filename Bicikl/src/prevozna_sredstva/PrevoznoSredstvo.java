package prevozna_sredstva;

public abstract class PrevoznoSredstvo {

    private String prozvodjac;

    private String model;

    private int godinaProzivodnje;

    private int brojMesta;

    private int predjenaKilometraza = 0;

    public PrevoznoSredstvo(String prozvodjac, String model, int godinaProzivodnje, int brojMesta) {
        this.prozvodjac = prozvodjac;
        this.model = model;
        this.godinaProzivodnje = godinaProzivodnje;
        this.brojMesta = brojMesta;
    }

    public String getProzvodjac() {
        return prozvodjac;
    }

    public void setProzvodjac(String prozvodjac) {
        this.prozvodjac = prozvodjac;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGodinaProzivodnje() {
        return godinaProzivodnje;
    }

    public void setGodinaProzivodnje(int godinaProzivodnje) {
        this.godinaProzivodnje = godinaProzivodnje;
    }

    public int getBrojMesta() {
        return brojMesta;
    }

    public void setBrojMesta(int brojMesta) {
        this.brojMesta = brojMesta;
    }

    public void predji(int x) {
        this.predjenaKilometraza += x;
    }

    public int getPredjenaKilometraza() {
        return predjenaKilometraza;
    }

}
