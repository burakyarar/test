package D_13;

public class C01_replace {

    public static void main(String[] args) {

        String str = "Javayi anliyorum ama yazamiyorum";

        System.out.println(str.replace('J', 'T')); // Tavayi anliyorum ama yazamiyorum

        System.out.println(str.replace('a', '*')); // J*v*yi *nliyorum *m* y*z*miyorum

        System.out.println(str.replace("ama yazamiyorum", "ve yazabiliyorum")); // Javayi anliyorum ve yazabiliyorum

        System.out.println(str.replace("Java", "AA")); // AAyi anliyorum ama yazamiyorum

    }
}
