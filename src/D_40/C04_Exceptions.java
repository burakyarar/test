package D_40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_Exceptions {

    public static void main(String[] args) {

        int toplam = 0;
        int girilenSayi = 0;

        Scanner scanner = new Scanner(System.in);

        /*
        try {
            for (int i = 0; i < 1000000; i++) {
                System.out.println("Lutfen toplamak uzere sayi giriniz");
                girilenSayi = scanner.nextInt();
                toplam += girilenSayi;

            }
        } catch (InputMismatchException e) {

            char girilenYanlisHarf = scanner.next().charAt(0);

            if (girilenYanlisHarf == 'Q' || girilenYanlisHarf == 'q') {
                System.out.println("Girdiginiz sayilarin toplami: " + toplam);
            } else {
                System.out.println("Yanlis input, program bitirilyor");
            }
        }
        */

        for (int i = 0; i < 100000; i++) {

            try {
                System.out.println("Lutfen toplamak uzere sayi giriniz");
                girilenSayi = scanner.nextInt();
                toplam += girilenSayi;
            } catch (InputMismatchException e) {

                char girilenYanlisHarf = scanner.next().charAt(0);

                if (girilenYanlisHarf == 'Q' || girilenYanlisHarf == 'q') {
                    System.out.println("Girdiginiz sayilarin toplami: " + toplam);
                } else {
                    System.out.println("Yanlis input, program bitirilyor");
                }
            }
        }


    }
}
