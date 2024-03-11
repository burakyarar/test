package D_18;

public class C07_DoWhileLoop {

    public static void main(String[] args) {

        /*
            loop cesitleri ve avantajlari

            1 - for loop; baslangic ve sonucu belli sayi olan durumlarda veya
                kac kere tekrar edecegini bildigimiz durumlarda avantajli

            2 - while loop; kac kere tekrar edecegini bilmedigimiz
                islemleri yapmada avantajli

            3 - do-while loop; kullanicidan deger alarak yapilan islemlerde ilk
                deger atama islemini kullanicinin yapmasi acisindan avantajli
         */

        int bas = 30;
        int bit = 20;
        int toplam = 0;

        while (bas <= bit) {

            toplam += bas;
            bas++;
        }

        System.out.println("Sayilar toplami: " + toplam);

        bas = 30;
        bit = 20;
        toplam = 0;

        do {

            toplam += bas;
            bas++;
        } while (bas <= bit);

        System.out.println("Sayilar toplami: " + toplam);

    }
}
