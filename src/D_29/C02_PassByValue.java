package D_29;

public class C02_PassByValue {

    public static void main(String[] args) {

        int sayi = 10;

        // int sayi = 20; Variable 'sayi' is already defined in the scope

        // String sayi = "40"; Variable 'sayi' is already defined in the scope

        System.out.println(sayi); // 10

        method1(sayi); // method1 sayi: 10 \n method1 degistirilen sayi: 20

        System.out.println("method1 calistiktan sonra main method sayi: " + sayi); // method1 calistiktan sonra main method sayi: 10

        method2(sayi); // method2 suha sayisi: 10

        // Java method'lar arasinda reference'i degil degerini transfer eder
        // Arka planda her seferinde yeni bir stack acilir ve method bittiginde silinir

    }

    public static void method1(int sayi) {

        System.out.println("method1 sayi: " + sayi);

        sayi = 20;

        System.out.println("method1 degistirilen sayi: " + sayi);
    }

    public static void method2(int suha) {

        System.out.println("method2 suha sayisi: " + suha);

    }

}
