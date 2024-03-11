package D_07;

public class C02_BagimsizIfCumleleri {

    public static void main(String[] args) {

        /*
            1-  Eger boolean sarttan sonra {} kullanilmazsa
                Java if body's olarak ilk ; 'e kadar olan bolumu alir
                digerleri if body'sinin disinda kalir

            2-  If cumlesinde {} kullanmaz ve boolean sartin
                sonuna ; yazarsaniz If cumlesi hic bir islem
                yapmaz cunku body'si yoktur

            3-  If body tek satir ise {} sart degildir
                If body birden fazla satir ise {} kullanilmali
         */


        int a = 20;
        int b = 30;

        if (a < b){ // true
            System.out.println("a b'den kucuk 1");
            System.out.println("a b'den kucuk 2");
            System.out.println("a b'den kucuk 3");
        } // If body ends here

        if (a % 2 == 0) // true
            System.out.println("a 2 ile tam bolunur 1"); // If body ends here
            System.out.println("a 2 ile tam bolunur 2"); // Printed
            System.out.println("a 2 ile tam bolunur 3"); // Printed

        a = 35;
        b = 30;

        if (a < b){ // false
            System.out.println("a b'den kucuk 1");
            System.out.println("a b'den kucuk 2");
            System.out.println("a b'den kucuk 3");
        } // If body ends here

        if (a % 2 == 0) // false
            System.out.println("a 2 ile tam bolunur 1"); // If body ends here
            System.out.println("a 2 ile tam bolunur 2"); // Printed
            System.out.println("a 2 ile tam bolunur 3"); // Printed

    }
}
