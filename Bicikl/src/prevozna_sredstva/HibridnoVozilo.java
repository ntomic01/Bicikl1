package prevozna_sredstva;

public interface HibridnoVozilo {

    public abstract RezimRada trenutniRezim();

    void promeniRezim(); // sa elektricnog na regularni, sa regularnog na elektricni

    int vratiProcenatBaterije();

    void dopuniBateriju(int procenat);

}
