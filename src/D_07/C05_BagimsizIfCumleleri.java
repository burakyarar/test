package D_07;

import java.util.Scanner;

public class C05_BagimsizIfCumleleri {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sayi = scanner.nextInt();
        boolean bl1 = false;

        if (sayi % 5 == 0 && sayi % 3 == 0 && sayi % 2 == 0) {
            System.out.println("Super Sayi");
        } else if (sayi % 5 == 0 || sayi % 3 == 0 && sayi % 2 == 0) {
            System.out.println("Muthis Sayi");
        } else if (sayi % 5 == 0 || sayi % 3 == 0 || sayi % 2 == 0) {
            System.out.println("Guzel Sayi");
        } else if (sayi % 5 != 0 || sayi % 3 != 0 || sayi % 2 != 0) {
            System.out.println("Bu Ne Bicim Sayi");
        }




    }
}
