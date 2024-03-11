package D_10;

import java.util.Scanner;

public class C02_SwitchStatement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Gun Numarasi Giriniz");
        int gunNo = scan.nextInt();

        switch (gunNo) {

            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                if (gunNo == 1 ) System.out.println("Pazartesi");
                if (gunNo == 2 ) System.out.println("Sali");
                if (gunNo == 3 ) System.out.println("Carsamba");
                if (gunNo == 4 ) System.out.println("Persembe");
                if (gunNo == 5 ) System.out.println("Cuma");
                System.out.println("Hafta Ici");
                break;
            case 6 :
            case 7 :
                if (gunNo == 6 ) System.out.println("Cumartesi");
                if (gunNo == 7 ) System.out.println("Pazar");
                System.out.println("Hafta Sonu");
                break;
            default:
                System.out.println("Gun Numarasi Gecersiz");
        }


    }
}
