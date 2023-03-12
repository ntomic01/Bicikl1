package teretana;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vezbac extends Osoba implements ClanTeretane {

    private double mesecnaClanarina;

    private String brojClanskeKartice;

    private List<Znacka> znacke;

    private List<UplataClanarine> uplate;

    public Vezbac(String ime, String prezime, String jmbg, String adresa, double mesecnaClanarina, String brojClanskeKartice) {
        super(ime, prezime, jmbg, adresa);
        this.mesecnaClanarina = mesecnaClanarina;
        this.brojClanskeKartice = brojClanskeKartice;
        this.znacke = new ArrayList<>();
        this.uplate = new ArrayList<>();
    }

    @Override
    public double vratiTrenutniDug() {
        // todo: proveriti da li postoji uplata za trenutni mesec
        if(placenTrenutniMesec()) {
            return 0;
        }
        int procenatPopusta = 0;
        for(Znacka znacka: znacke) {
            procenatPopusta += znacka.getPopust();
        }
        // mesecnaClanarina * (100 - procenatPopusta) / 100
        // npr: clanarina 3000, procenat popusta 15%
        // 3000 * (100 - 15) / 100 = 3000 * 0.85 = 2550
        // posmatramo int kao double da ne bi 0.85 tretirao kao 0
        double iznosDuga = mesecnaClanarina * ((double) (100 - procenatPopusta) / 100);
        return iznosDuga;
    }

    @Override
    public void uplati(double iznos) {
        // todo: proveriti da li se uplata vrsi pre 10og u mesecu (new Date().getDay() 0-29)
        // ukoliko se vrsi korisnik dobija znacu redovni_platisa, ukoliko ne, a vec je poseduje, gubi je
        if(vratiTrenutniDug() == 0) {
            System.out.println("Ne postoji dugovanje");
        } else {
            UplataClanarine uplataClanarine = new UplataClanarine(this, iznos);
            System.out.println("Evidentirana je nova uplata za vezbaca: "+this.brojClanskeKartice);
            this.uplate.add(uplataClanarine);
        }
    }

    @Override
    public List<UplataClanarine> listaUplata() {
        return uplate;
    }

    @Override
    public List<Znacka> getZnacke() {
        return znacke;
    }

    public void dodajNovuZnacku(Znacka znacka) {
        this.znacke.add(znacka);
    }

    public double getMesecnaClanarina() {
        return mesecnaClanarina;
    }

    public void setMesecnaClanarina(double mesecnaClanarina) {
        this.mesecnaClanarina = mesecnaClanarina;
    }

    public String getBrojClanskeKartice() {
        return brojClanskeKartice;
    }

    public void setBrojClanskeKartice(String brojClanskeKartice) {
        this.brojClanskeKartice = brojClanskeKartice;
    }

    private boolean placenTrenutniMesec() {
        int trenutniMesec = new Date().getMonth();
        for(UplataClanarine uplataClanarine: uplate) {
            // uplataClanarine.getDatumUplate().getMonth()
            if(uplataClanarine.getDatumUplate().getMonth() == trenutniMesec) {
                return true;
            }
        }
        return false;
    }

}
