package D_27;

public class C06_ArabaRunner {

    public static void main(String[] args) {

        C05_Araba araba1 = new C05_Araba("Opel",2010,4000);

        System.out.println(araba1);
        // C03_Araba ==> marka='Opel', model='Model Belirtilmemis',
        //               yil=2010, fiyat=4000, renk='Renk Belirtilmemis

        C05_Araba araba2 = new C05_Araba("Nissan","Micra",2005);

        System.out.println(araba2);
        // C03_Araba ==> marka='Nissan', model='Micra',
        //               yil=2005, fiyat=0, renk='Renk Belirtilmemis


    }
}
