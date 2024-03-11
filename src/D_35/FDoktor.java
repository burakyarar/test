package D_35;

public class FDoktor extends EMuhasebe{

    FDoktor() {
        super(3);
        System.out.println("Parametresiz Doktor Cons Calisti");
    }

    FDoktor(String str) {
        System.out.println("String Parametreli Doktor Cons Calisti");
    }

    FDoktor(int sayi) {
        this();
        System.out.println("Int Parametreli Doktor Cons Calisti");
    }

    public static void main(String[] args) {

        /*

        FDoktor doktor1 = new FDoktor("Java");

        // Parametresiz Hastane Cons Calisti
        // Parametresiz Muhasebe Cons Calisti
        // String Parametreli Doktor Cons Calisti

        */


        /*

        FDoktor doktor2 = new FDoktor();

        // Parametresiz Hastane Cons Calisti
        // String Parametreli Muhasebe Cons Calisti
        // Int Parametreli Muhasebe Cons Calisti
        // Parametresiz Doktor Cons Calisti

         */

        FDoktor doktor3 = new FDoktor(5);
        // Parametresiz Hastane Cons Calisti
        // String Parametreli Muhasebe Cons Calisti
        // Int Parametreli Muhasebe Cons Calisti
        // Parametresiz Doktor Cons Calisti
        // Int Parametreli Doktor Cons Calisti
    }
}
