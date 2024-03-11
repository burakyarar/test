package D_30;

import java.util.ArrayList;
import java.util.List;

public class C01_StringPool {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = "Ja" + "va";
        String a = "Ja";
        String b = "va";
        String str5 = a + b;
        String str6 = a.concat(b);

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str4); // true
        System.out.println(str1 == str5); // false
        System.out.println(str1 == str6); // false

        /*
            str1.equals(str2) ==> sadece metinlere bakar, ayni ise true doner

            str1 == str2 ==> hem metne hem de referansa bakar, ikisi de ayni ise true doner

            orneklerde gorulacegi uzere bazi String objelerin referanslari ayni olabilir
         */
        System.out.println("-----------------------");

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // true
        System.out.println(str1.equals(str5)); // true
        System.out.println(str1.equals(str6)); // true

        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");

        for (String s : list) System.out.print(s); // onetwo

    }
}
