package D_27;

public class C04_ArabaRunner {

    public static void main(String[] args) {

        C03_Araba araba1 = new C03_Araba();

        System.out.println(araba1);
        // C03_Araba ==> marka='Marka Belirtilmemis', model='Model Belirtilmemis',
        //               yil=1900, fiyat=0, renk='Yil Belirtilmemis

        araba1.marka = "Mercedes";
        araba1.model = "E200";
        araba1.yil = 2010;
        araba1.fiyat = 15000;
        araba1.renk = "Siyah";

        System.out.println(araba1);
        // C03_Araba ==> marka='Mercedes', model='E200',
        //               yil=2010, fiyat=15000, renk='Siyah

        /*
            Her seferinde yeni objelere yeniden atama yapmak gerekir

            Bunun yerine Constructor Call'a paramtere deger yazilabilir

         */

        C03_Araba araba2 = new C03_Araba("BMW","5.20",2017,33000,"Mavi");

        System.out.println(araba2);
        // C03_Araba ==> marka='BMW', model='5.20',
        //               yil=2017, fiyat=33000, renk='Mavi

        C03_Araba araba3 = new C03_Araba("Volvo", "C40", 2005, 5000, "Yesil");

        System.out.println(araba3);
        // C03_Araba ==> marka='Volvo', model='C40',
        //               yil=2005, fiyat=5000, renk='Yesil

        C03_Araba araba4 = new C03_Araba();



    }
}
