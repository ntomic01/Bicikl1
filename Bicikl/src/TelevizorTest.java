
public class TelevizorTest {

    public static void main(String[] args) {

        Televizor televizor1 = new Televizor();
        System.out.println(televizor1.toString());

        televizor1.ukljuciTelevizor();
        System.out.println(televizor1);

        televizor1.pojacajTon();
        System.out.println(televizor1);

        televizor1.pojacajTon();
        System.out.println(televizor1);

        televizor1.smanjiTon();
        System.out.println(televizor1);

        televizor1.iskljuciTelevizor();
        System.out.println(televizor1);

        Kanali kanal1 = new Kanali("RTS1");
        Kanali kanal2 = new Kanali("ArenaSport1");
        System.out.println(kanal1.toString());
        System.out.println(kanal2.toString());





    }
}
