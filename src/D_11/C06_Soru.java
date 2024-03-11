package D_11;

import java.util.Scanner;

public class C06_Soru {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Mail Adresinizi Giriniz");
        String mail = scanner.next();

        if (!mail.contains("@")) {
            System.out.println("Gecersiz Mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("Mail gmail Olmali");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("Mailde Yazim Hatasi Var");
        }

    }
}
