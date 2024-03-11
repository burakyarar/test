package D_11;

public class C05_startsWith_endsWith {

    public static void main(String[] args) {

        String str = "Java cok guzel, cok";

        System.out.println(str.startsWith("Java")); // true
        System.out.println(str.startsWith("J")); // true
        System.out.println(str.startsWith("Java cok guzel, cok")); // true

        System.out.println(str.startsWith("c",5)); // true

        System.out.println(str.endsWith("cok")); // true
        System.out.println(str.endsWith("k")); // true
        System.out.println(str.endsWith("Java cok guzel, cok")); // true


    }


}
