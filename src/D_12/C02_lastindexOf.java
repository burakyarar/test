package D_12;

public class C02_lastindexOf {

    public static void main(String[] args) {

        String str = "Javayi ogrenecegiz, baska yolu yok";

        System.out.println(str.indexOf("a")); // 1

        System.out.println(str.lastIndexOf("a")); // 24

        System.out.println(str.indexOf("J")); // 0

        System.out.println(str.lastIndexOf("J")); // 0

        if (str.indexOf("e") == 1) {
            System.out.println("harf hic kullanilmamis");
        } else if (str.indexOf("e") == str.lastIndexOf("e")) {
            System.out.println("harf bir kez kullanilmis");
        } else System.out.println("harf birden fazla kez kullanilmis");

        System.out.println(str.lastIndexOf("o")); // 32

        System.out.println(str.lastIndexOf("o", 31)); // 27


    }
}
