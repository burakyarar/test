package D_22;

public class C01_Arrays {

    public static void main(String[] args) {

        String[] isimler = {"Ayse","Yusuf","Bugra","Abdullah","Nergiz","Gulay","Ramazan"};

        int sayac = 0;
        int kelimeUzunlugu = 0;

        for (int i = 0; i < isimler.length; i++) {

            kelimeUzunlugu = isimler[i].length();

            if (kelimeUzunlugu % 2 != 0) {
                System.out.print(isimler[i] + " "); // Yusuf Bugra Gulay Ramazan
                sayac++;
            }

        }

        System.out.println("\nToplam " + sayac + " adet isim yazdirildi"); // Toplam 4 adet isim yazdirildi

    }

}
