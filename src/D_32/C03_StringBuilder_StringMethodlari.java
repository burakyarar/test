package D_32;

public class C03_StringBuilder_StringMethodlari {

    public static void main(String[] args) {

        String str = "Java Candir";

        StringBuilder sb1 = new StringBuilder(str);

        // sb1 = str;

        // non-primitive data turlerinde farki data turleri arasinda
        // atama yapabilmek icin aralarinda Parent-Chil iliskisi olmalidir.

        System.out.println(sb1); // Java Candir

        System.out.println(sb1.substring(0, 4)); // Java

        System.out.println(sb1); // Java Candir

        System.out.println(sb1.toString().contains("J")); // true

        // StringBuilder'da olmayip String'de olan method'lari kullanmak icin
        // sb1.toString() ile String'e gecis yapilabilir
        // bu durumda calisan method'lar sb1'i kalici olarak DEGISTIRMEYECEK

    }
}
