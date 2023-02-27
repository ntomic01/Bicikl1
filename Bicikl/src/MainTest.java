public class MainTest {


    public static void main(String[] args) {

        Bicikl_Za_Planinarenje bicikl_za_planinarenje = new Bicikl_Za_Planinarenje(2,34,150, "crvena");
        GradskiBicikl gradskiBicikl1 = new GradskiBicikl(3,45, "plava", 160);
        System.out.println(bicikl_za_planinarenje.toString());

        Radnik radnik1 = new Radnik(49000, "Nikola", "Tomic",TipRadnika.programer);
        Radnik radnik2 = new Radnik(80000, "Dejan", "Simeunovic", TipRadnika.elektrotehnicar);
        Radnik radnik3 = new Radnik(60000,"Marko", "Markovic", TipRadnika.masinac);

        System.out.println(radnik1.toString());
        System.out.println(radnik2.toString());
        System.out.println(radnik3.toString());
        System.out.println(radnik1.jeInzenjer());
        System.out.println(radnik2.jeInzenjer());
        System.out.println(radnik3.jeInzenjer());
        System.out.println(radnik2.povecajPlatu(radnik1));
        System.out.println(radnik1.povecajPlatu(radnik2));
        System.out.println(radnik3.povecajPlatu(radnik3));







    }






}
