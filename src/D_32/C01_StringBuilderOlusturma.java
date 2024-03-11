package D_32;

public class C01_StringBuilderOlusturma {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();

        System.out.println(sb1); //
        System.out.println(sb1.length()); // 0
        System.out.println(sb1.capacity()); // 16

        StringBuilder sb2 = new StringBuilder("Java Candir.");
        System.out.println(sb2); // Java Candir.
        System.out.println(sb2.length()); // 12
        System.out.println(sb2.capacity()); // 28

        StringBuilder sb3 = new StringBuilder(9);

        sb3.append("Java Candir.");
        System.out.println(sb3); // Java Candir.
        System.out.println(sb3.length()); // 12
        System.out.println(sb3.capacity()); // 2*9+2 = 20

        sb3.trimToSize();
        System.out.println(sb3); // Java Candir.
        System.out.println(sb3.length()); // 12
        System.out.println(sb3.capacity()); // 12

    }
}
