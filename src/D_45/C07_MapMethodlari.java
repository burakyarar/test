package D_45;

import java.util.HashMap;
import java.util.Map;

public class C07_MapMethodlari {

    public static void main(String[] args) {

        Map<String , Integer> harfler = new HashMap<>();

        harfler.put("K",25);
        harfler.put("L",10);
        harfler.put("T",5);
        harfler.put("Z",50);
        harfler.put("A",15);

        System.out.println(harfler);

        harfler.put("L",40);

        System.out.println(harfler);

        System.out.println(harfler.containsKey("Z")); // true
        System.out.println(harfler.containsValue(5)); // true
        /*
            Eger birlestirilmis bir String ise "Ali-Can-11-H-MF"
            harfler.containsValue("Ali") false doner
            value'yu butun olarak arar, value'nun bir parcasini kontrol etmez
         */

        System.out.println(harfler.getOrDefault("G", 0)); // 0
        System.out.println(harfler.getOrDefault("T", 0)); // 5

        System.out.println(harfler.get("G")); // null

        System.out.println(harfler.replace("T", 90)); // 5 (degistirdikten sonra eski degerini getirdi)

        System.out.println(harfler.replace("A", 20, 30)); // false

        System.out.println(harfler.replace("K", 25, 30)); // true (degistirdikten sonra eski degerini getirdi)

        System.out.println(harfler.remove("Z")); // 50 (sildikten sonra degerini getirdi)

        System.out.println(harfler.remove("Y")); // null

        System.out.println(harfler.remove("T", 70)); // false

    }
}
