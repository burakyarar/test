package D_17;

import java.util.Scanner;

public class C01_AsalSayiBulma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pozitif Bir Tam Sayi Giriniz");
        int sayi = scanner.nextInt();

        System.out.println(asalSayiMi(sayi));


    } // M M Sonu

    public static boolean asalSayiMi (int sayi) {

        boolean flag = true;

        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                flag = false;
                break;

            }
        }

        if (flag) {
            return true;
        } else {
            return false;
        }
    }

} // Class Sonu
