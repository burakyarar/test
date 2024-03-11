package D_14;

import java.util.Scanner;

public class C03_Faktoryel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 20'den Kucuk Bir Sayi Giriniz");
        int sayi = scanner.nextInt();

        int carpim = 1;

        for (int i = 1; i <= sayi; i++) {
            carpim *= i;
        }
        System.out.println("Faktoryeli: " + sayi + "! " + carpim);



    }
}
