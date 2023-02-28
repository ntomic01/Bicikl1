package prevozna_sredstva;

import java.util.Date;

public abstract class MotornoVozilo extends PrevoznoSredstvo {

    private String registarskeOznake;

    private int brojKonjskihSnaga;

    private TipGoriva tipGoriva;

    private Date datumVazenjaRegistracije;

    public MotornoVozilo(String prozvodjac, String model, int godinaProzivodnje, int brojMesta) {
        super(prozvodjac, model, godinaProzivodnje, brojMesta);
    }

    public abstract void produziRegistraciju();

    public abstract void obaviServis(); // servis za auto se razliku je od servisa za motor ili autobus

}
