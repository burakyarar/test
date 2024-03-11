package D_06;

public class C01_Concatenation {

    public static void main(String[] args) {

        String a = "Hello";
        int b = 2;
        int c = 3;

        System.out.println(a + b + c); // Hello23
        System.out.println(c + b + a); // 5Hello
        System.out.println(a + (b + c)); // Hello5
        System.out.println(a + b * c); // Hello6

        String s1 = "Java";
        String s2 = "Candir";
        String s3 = " ";
        String s4 = "";
        b = 3;
        c = 5;

        System.out.println(s1 + b + c); // Java35
        System.out.println(s1 + b * c); // Java15
        System.out.println(b + c + s2); // 8Candir
        System.out.println(c + (b + s1)); // 53Java
        System.out.println(s4 + c + b + s1); // 53Java
        System.out.println(c + s4 + b + s1); // 53Java
         System.out.println(s4 + b + c + s3 + s1); // 35 Java

        // "23" ==> Integer    Integer.parseInteger("23") ==> 23

    }
}
