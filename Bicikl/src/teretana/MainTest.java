package teretana;

public class MainTest {

    public static void main(String[] args) {

        Vezbac vezbac1 = new Vezbac("Pera", "Peric", "134242424", "Novi Beograd", 3000, "156-P");
        vezbac1.dodajNovuZnacku(Znacka.student);
        vezbac1.dodajNovuZnacku(Znacka.dugogodisnji_clan);

        Vezbac vezbac2 = new Vezbac("Mika", "Mikic", "109786756", "Novi Beograd", 3000, "782-P");

        System.out.println("Iznos duga za "+vezbac1.getIme()+": "+vezbac1.vratiTrenutniDug());
        System.out.println("Iznos duga za "+vezbac2.getIme()+": "+vezbac2.vratiTrenutniDug());

        Teretana teretana1 = new Teretana("Ahiler", "Novi Beograd");

        Teretana teretana2 = new Teretana("Kocovic", "Usce, Novi Beograd");

        teretana1.uclaniNovogVezbaca(vezbac1);
        teretana2.uclaniNovogVezbaca(vezbac2);

        teretana1.ispisiSveDuznike();

        vezbac1.uplati(2460);

        System.out.println("Iznos duga za "+vezbac1.getIme()+": "+vezbac1.vratiTrenutniDug());

        vezbac1.uplati(2460);

        teretana1.ispisiSveDuznike();

    }

}
