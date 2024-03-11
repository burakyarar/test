package D_38;

public class Z_Ex_01 {

    public static void main(String[] args) {

        /*
        int sayi = 1;

        for (int i = 1; i <= 20; i++) {
            System.out.println(sayi);
            sayi++;
        }
         */

        /*
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
         */

        /*
        int sayi = 7;

        for (int i = 0; i <= 10; i++) {
            System.out.println(sayi + " X " + i + " = " + (sayi * i));
        }
         */
    }

    public static String carpimSonucu(int sayi) {

        String sonuc = "";
        int carpim = 0;

        for (int i = 1; i <=  10; i++) {
            carpim = sayi * i;
            sonuc = (sayi + " X " + i + " = " + carpim);
            System.out.println(sonuc);
        }

        String bitis = "Islem tamamlandi";
        System.out.println(bitis);
        return bitis;
    }
}
