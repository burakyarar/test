package D_11;

public class C03_substring {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.substring(3)); // a Candir

        System.out.println(str.substring(5,10)); // Candi

        System.out.println(str.substring(1,2)); // a

        System.out.println(str.length()); // 11

        System.out.println(str.substring(3,3)); //

        System.out.println(str.substring(str.length() - 3)); // dir


        String st1 = "Java";
        String st2 = " ";
        String st3 = "Candir";

        System.out.println(st1 + st2 + st3); // Java Candir

        System.out.println(st1.concat(st2).concat(st3)); // Java Candir




    }
}
