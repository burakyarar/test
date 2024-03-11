package D_13;

public class C04_replaceFirst {

    public static void main(String[] args) {

        String str = "Java Candir, kendisini cok seviyoruz123.";

        System.out.println(str.replaceFirst("a", "A")); // JAva Candir, kendisini cok seviyoruz123.

        System.out.println(str.replaceFirst(" ", "  ")); // Java  Candir, kendisini cok seviyoruz123.

        System.out.println(str.replaceFirst("\\d", " ")); // Java Candir, kendisini cok seviyoruz 23.

        System.out.println(str.replaceFirst("\\W", "*")); // Java*Candir, kendisini cok seviyoruz123.

    }
}
