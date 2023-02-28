package prevozna_sredstva;

public class MainTest {

    public static void main(String[] args) {
        Automobil automobil = new Automobil("Mercedes", "E220", 2020, 5);
        Bicikl bicikl = new Bicikl("BMX", "BMX", 2020, 2);

        /*
            Ako je hibridno vozilo u elektricnom modu, za svaku predjenu kilometrazu potrebno mu je umanjiti procenat baterije
         */
        automobil.predji(100);
        automobil.promeniRezim();
        automobil.predji(100);

        bicikl.predji(2);

        bicikl.predji(5);

        bicikl.promeniRezim();

        automobil.predji(50);



    }


}
