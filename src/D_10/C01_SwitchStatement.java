package D_10;

import java.util.Scanner;

public class C01_SwitchStatement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen Anlamini Gormek Istediginiz Harfi Giriniz");

        char harf = scan.next().toUpperCase().charAt(0);

        switch (harf) {

            case 'I' :
                System.out.println("International");
                break;
            case 'S' :
                System.out.println("Software");
                break;
            case 'T' :
                System.out.println("Testing");
                break;
            case 'Q' :
                System.out.println("Qualifications");
                break;
            case 'B' :
                System.out.println("Board");
                break;

            default:
                System.out.println("Yazdigin Harf Elimizde Yok");
        }

    }
}
