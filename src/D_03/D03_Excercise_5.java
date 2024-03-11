package D_03;

import java.util.Scanner;

public class D03_Excercise_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci Degeri Giriniz");

        int ilkSayi = scanner.nextInt();

        System.out.println("Ikinci Degeri Giriniz");

        int ikiSayi = scanner.nextInt();

        int any = ilkSayi;

        ilkSayi = ikiSayi;

        ikiSayi = any;

        System.out.println("Birinci Deger: " + ilkSayi + "\nIkinci Deger: " + any);


    }
}
