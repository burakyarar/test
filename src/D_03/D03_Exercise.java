package D_03;

import java.util.Scanner;

public class D03_Exercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 3 Deger Giriniz");

        int deger1 = scanner.nextInt();
        int deger2 = scanner.nextInt();
        int deger3 = scanner.nextInt();

        System.out.println("Lutfen 3 Double Giriniz");

        double db1 = scanner.nextDouble();
        double db2 = scanner.nextDouble();
        double db3 = scanner.nextDouble();

        System.out.println("Toplam: " + ((deger1 + deger2 + deger3) + (db1 + db2 + db3)));

        System.out.println("Carpim: " + ((deger1 * deger2 * deger3) * (db1 * db2 * db3)));


    }
}
