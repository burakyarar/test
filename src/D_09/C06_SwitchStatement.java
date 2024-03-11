package D_09;

import java.util.Scanner;

public class C06_SwitchStatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kacinci Aydasiniz");

        int ayno = scanner.nextInt();

        if (ayno > 0 && ayno < 13) {
            if (ayno == 1) System.out.println("Ocak");
            if (ayno == 2) System.out.println("Subat");
            if (ayno == 3) System.out.println("Mart");
            if (ayno == 4) System.out.println("Nisan");
            if (ayno == 5) System.out.println("Mayis");
            if (ayno == 6) System.out.println("Haziran");
            if (ayno == 7) System.out.println("Temmuz");
            if (ayno == 8) System.out.println("Agustos");
            if (ayno == 9) System.out.println("Eylul");
            if (ayno == 10) System.out.println("Ekim");
            if (ayno == 11) System.out.println("Kasim");
            if (ayno == 12) System.out.println("Aralik");

                if (ayno == 12 || ayno == 1 || ayno == 2) {
                    System.out.println("Kis Mevsimi");
                } else if (ayno == 3 || ayno == 4 || ayno == 5) {
                    System.out.println("Ilkbahar Mevsimi");
                } else if (ayno == 6 || ayno == 7 || ayno == 8) {
                    System.out.println("Yaz Mevsimi");
                } else System.out.println("Sonbahar Mevsimi");

        } else System.out.println("Gecersiz Ay Numarasi");

        switch (ayno) {

            case 1 :
                System.out.println("Ocak");
                break;
            case 2 :
                System.out.println("Subat");
                break;
            case 3 :
                System.out.println("Mart");
                break;
            case 4 :
                System.out.println("Nisan");
                break;
            case 5 :
                System.out.println("Mayis");
                break;
            case 6 :
                System.out.println("Haziran");
                break;
            case 7 :
                System.out.println("Temmuz");
                break;
            case 8 :
                System.out.println("Agustos");
                break;
            case 9 :
                System.out.println("Eylul");
                break;
            case 10 :
                System.out.println("Ekim");
                break;
            case 11 :
                System.out.println("Kasim");
                break;
            case 12 :
                System.out.println("Aralik");
                break;

            default:
                System.out.println("Gecersiz Ay Numarasi");
        }

    }
}
