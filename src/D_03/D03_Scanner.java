package D_03;

import java.util.Scanner;

public class D03_Scanner {

    public static void main(String[] args) {

        // Scanner ile 3 adimda bilgi alabiliriz

        // Kullanicidan tam sayi al ve karesini yazdir

        Scanner scanner = new Scanner(System.in); // 1: Scanner objesi olusturmak

        System.out.println("Lutfen bir tam sayi giriniz"); // 2. Kullaniciya ne istediginizi soylemek

        int girilenSayi = scanner.nextInt(); // 3. Data turune uygun bir variable olusturmak ve scanner objesiyle ugun metodla girilen degeri almak

        System.out.println("Girilen Sayinin Karesi: " + girilenSayi*girilenSayi);

        int deger1 = scanner.nextInt();
        int deger2 = scanner.nextInt();
        int deger3 = scanner.nextInt();

        double db1 = scanner.nextDouble();
        double db2 = scanner.nextDouble();
        double db3 = scanner.nextDouble();





    }
}
