package teretana;

import java.util.List;

public interface ClanTeretane {

    String getBrojClanskeKartice();

    public abstract double vratiTrenutniDug();

    void uplati(double iznos);

    List<UplataClanarine> listaUplata();

    List<Znacka> getZnacke();

}
