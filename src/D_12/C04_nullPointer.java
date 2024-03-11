package D_12;

public class C04_nullPointer {

    public static void main(String[] args) {

        String str1;

        // System.out.println(str1);
        // str1.concat(" candir");

        str1 = "java";

        System.out.println(str1); // java
        System.out.println(str1.concat(" candir")); // java candir

        /*
            null bir deger degil, pointer'dir

            26. satir icin
            str2'nin degeri null veya str2'ye null degeri atanmistir ifadeleri YANLISTIR

            Dogru Ifade:
            str2'ye deger atamadik, bunun farkindayiz ve null olarak isaretledik
         */

        String str2 = null;

        System.out.println(str2); // null
        System.out.println(str2 + " candir"); // null candir

        // System.out.println(str2.concat(" candir")); // NullPointerException

        str2 = "tava";

        System.out.println(str2); // tava
        System.out.println(str2.concat(" candir")); // tava candir

        String str3 = "";
        String str4 = null;

        System.out.println(str3.isBlank()); // true
        System.out.println(str3.isEmpty()); // true

        // System.out.println(str4.isBlank()); // NullPointerException
        // System.out.println(str4.isEmpty()); // NullPointerException

    }
}
