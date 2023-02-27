public class Televizor {

    int jacinaTona = 0;

    boolean jeUkljucen = false;

    private Kanali kanali;


    void ukljuciTelevizor(){
        jeUkljucen = true;
    }
    void pojacajTon(){
        jacinaTona ++;
    }

    void smanjiTon(){
        jacinaTona--;
    }

    void iskljuciTon(){
        jacinaTona = 0;
    }

    void iskljuciTelevizor(){
        jeUkljucen = false;
    }

    boolean daLiJeUkljucen(){
        return jeUkljucen;
    }

    int vratiJacinuTona(){
        return jacinaTona;
    }


    @Override
    public String toString() {
        return "Televizor{" +
                "jacinaTona=" + jacinaTona +
                ", jeUkljucen=" + jeUkljucen +
                '}';
    }
}
