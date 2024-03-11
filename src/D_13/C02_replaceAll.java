package D_13;

public class C02_replaceAll {
    public static void main(String[] args) {

        String str = "1Ja4va 8C9a2n5d1i1r.";

        str = str.replaceAll("1", "");

        System.out.println(str); // Ja4va 8C9a2n5dir.

        str = str.replaceAll("\\d" , "");

        System.out.println(str); // Java Candir.

        str = str.replaceAll("\\w" , "");

        System.out.println(str); //  .


    }
}
