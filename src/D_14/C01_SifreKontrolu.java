package D_14;

import java.util.Scanner;

public class C01_SifreKontrolu {

    public static void main(String[] args) {

        // Bir sifre al
        // Ilk harf kucuk harf olmali
        // son karakter rakam olmali
        // sifre bosluk icermemeli
        // uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Sifrenizi Giriniz");

        String sifre = scanner.nextLine();

        boolean flag = true;

        char ilkHarf = sifre.charAt(0);

        if (!(ilkHarf >= 'a' && ilkHarf <='z')) {
            System.out.println("Ilk Karakter Kucuk Harf Olmali");
            flag = false;
        }

        char sonKar = sifre.charAt(sifre.length() - 1);

        if (!(sonKar >= '0' && sonKar <= '9')) {
            System.out.println("Son Karakter Rakam Olmali");
            flag = false;
        }

        if (sifre.contains(" ")) {
            System.out.println("Sifre Bosluk Icermemeli");
            flag = false;
        }

        if (!(sifre.length() >= 10)) {
            System.out.println("Sifre En Az 10 Karakter Olmali");
            flag = false;
        }

        if (flag) {
            System.out.println("Sifreniz Gecerli");
        }




    }
}
