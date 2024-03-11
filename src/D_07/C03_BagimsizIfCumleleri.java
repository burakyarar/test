package D_07;

import java.util.Scanner;

public class C03_BagimsizIfCumleleri {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir pozitif tam sayi giriniz");

        int sayi = scanner.nextInt();

        boolean bl1;
        boolean bl2;
        boolean bl3;

        if (sayi % 5 == 0) {
            System.out.println("Sayi 5'in tam kati");

        };

        if (sayi % 3 == 0) {
            System.out.println("Sayi 3'un tam kati");

        }

        if (sayi % 2 == 0) {
            System.out.println("Sayi 2'nin tam kati");

        }

        //if (bl1 = true && bl2 = true && bl3 = true) {
            System.out.println("Sayi bir asal sayi");
        }


    }
