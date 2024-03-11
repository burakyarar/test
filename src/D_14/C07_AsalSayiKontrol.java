package D_14;

import java.util.Scanner;

public class C07_AsalSayiKontrol {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir Pozitif Sayi Giriniz");
        int sayi = scanner.nextInt();

        boolean flag = true;

        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                System.out.print(sayi / i + ", ");
                flag = false;
                // break;
            }
        }

        if (flag) {
            System.out.println("Sayi Asal Sayi");
        } else System.out.println("Sayi Asal Degil");
    }
}
