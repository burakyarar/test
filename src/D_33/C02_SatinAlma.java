package D_33;

public class C02_SatinAlma {

    public static void main(String[] args) {

        /*

        default olursa deger atanabilir ve sonuc gorulebilir
        private olursa hic bir sekilde ulasilamaz

        C01_Pazarlama pazarlama = new C01_Pazarlama();
        pazarlama.satis = 200;
        System.out.println(pazarlama.satis);
        pazarlama.toplamSatis = 500;
        System.out.println(pazarlama.toplamSatis);

        bir class uyeisne baska class'larin erisimini
        okuma(read / deger gorme) ve yazma(write / deger atama) seklinde
        derecelendirmek access modifier ile yapilamaz

        */

        /*
            bir class uyesine erisimi read ve write olarak ayirmak icin
            ilk yapilacak sey,
            access modifier ile erisimi engellemek
         */

        C01_Pazarlama pazarlama = new C01_Pazarlama();

        pazarlama.setSatis(100);
        pazarlama.setSatis(200);
        pazarlama.setSatis(400);

        // System.out.println(pazarlama.setSatis(100));

        System.out.println(pazarlama.getToplamSatis()); // 700
    }
}
