package D_12;

public class C01_indexOf {
    public static void main(String[] args) {

        String str = "Ali topu at, topu at ali";

        System.out.println(str.indexOf("topu")); // 4

        System.out.println(str.indexOf("top", 5)); // 13

        if (str.indexOf("at") == -1) {
            System.out.println("Hic Kullanilmamis");
        } else if (str.indexOf(("at"),str.indexOf("at")+1) >= 0){
            System.out.println("Birden Fazla Kez Kullanilmis");
        } else System.out.println("Bir Kez Kullanilmis");

        // System.out.println(str.indexOf("at",str.indexOf("at")+1));







    }
}
