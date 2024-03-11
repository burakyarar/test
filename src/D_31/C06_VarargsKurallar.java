package D_31;

public class C06_VarargsKurallar {

    public static void main(String[] args) {


        islemYap(3,4,5); // Islem sonucu: 27
    }

    private static void islemYap(int ilkSayi, int... kalanlar) {

        int toplam = 0;

        for (int eachSayi: kalanlar
             ) {
            toplam += eachSayi;
        }

        int sonuc = ilkSayi * toplam;

        System.out.println("Islem sonucu: " + sonuc);

    }


}
