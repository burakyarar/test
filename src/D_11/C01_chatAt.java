package D_11;

public class C01_chatAt {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.charAt(0)); // J

        System.out.println(str.length()); // 11

        System.out.println(str.charAt(11 - 1)); // r ==> sondan birinci

        // System.out.println(str.charAt(11+1)); // String index out of range: 12

        System.out.println(str.toUpperCase().charAt(3)); // A



    }
}
