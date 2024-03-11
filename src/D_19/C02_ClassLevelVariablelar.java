package D_19;

public class C02_ClassLevelVariablelar {

    static boolean bls;
    boolean bli;

    static String strs = "Java";
    String stri;

    static int sayis;
    int sayii = 23;

    static char chrs = 'a';
    char chri;

    public static void main(String[] args) {

        System.out.println(bls); // false
        System.out.println(strs); // Java
        System.out.println(sayis); // 0
        System.out.println(chrs); // a

        System.out.println("");

        C02_ClassLevelVariablelar obj = new C02_ClassLevelVariablelar();
        System.out.println(obj.bli); // false
        System.out.println(obj.stri); // null
        System.out.println(obj.sayii); //23
        System.out.println(obj.chri); //

    }

    /*
        Class Level Kurallari
            1 - class level variable'lara deger atanmazsa da
                hem olusturulabilir hem de kullanilabilirler
                deger atamasi yapmadiysak, java onlara default olan degerleri atar

                boolean ==> false
                sayisal ==> 0
                char ==> '' char olarak hiclik
                non-primitive ==> null

            2 - instance variable'lar static method'lar icinden direk ulasilamaz
                static method icine instace variable kullanmak icin
                o class'da bir obje olusturup o obje userinden instance variable'lara ulasilabilir

            3 - baska class'daki class level variable'lara ulasmak icin static variable'lar
                icin clasIsmi.statiVariableIsmi yazarak ulasabiliriz

                instance variable'lara ulasmak icin variable'larin
                oldugu class'dan obje olusturulmalidir

                static variable'a obj uzerinden ulasmak istersen Java otomatik getirmez
                ama elle yazinca kabul eder
                IntelliJ static variable'a instance gibi inj uzerinden ulasinca
                kodu sariya boyayarak uyarir


     */


}


