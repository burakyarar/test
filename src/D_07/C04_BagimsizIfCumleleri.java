package D_07;

import java.util.Scanner;

public class C04_BagimsizIfCumleleri {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ucgening 3 kenar uzunluklarini giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        /*
            Java'da 3'lu karsilastirma olmaz
            ikili karsilastirma yapip && veya ||
            ile birlestirilmeli
         */

        if (kenar1 == kenar2 && kenar1 == kenar3) {
            System.out.println("Eskenar Ucgen");
        }

    }
}
