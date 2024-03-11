package D_08;

import java.util.Scanner;

public class C02_IfElse_Exercise {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Bugun Gunlerden Ne?");

        String gun = scanner.next();

        /*
        int gun1 = 1;
        int gun2 = 2;
        int gun3 = 3;
        int gun4 = 4;
        int gun5 = 5;
        */

        int gunn = 0;

        String pzt = "pazartesi";
        String sl  = "sali";
        String crb = "carsamba";
        String prb = "persembe";
        String cm  = "cuma";
        String cms = "cumartesi";
        String pzr = "pazar";

        boolean hftici = gun.equals(pzt) || gun.equals(sl) || gun.equals(crb) || gun.equals(prb);

        boolean hftsn = gun.equals(pzr) || gun.equals(cms);

        if (gun.equals(pzt)) gunn = 1;
        if (gun.equals(sl)) gunn = 2;
        if (gun.equals(crb)) gunn = 3;
        if (gun.equals(prb)) gunn = 4;

        if (hftsn) {
            System.out.println("Simdi Dinlenme Zamani");
        } else if (hftici) {
            System.out.println("Simdi calisma zamani, tatile " + (5 - gunn) + " gun kaldi" );
        } else if (gun.equals(cm)) {
            System.out.println("Simdi calisma zamani, yarin tatil");
        } else {
            System.out.println("Gecersiz Gun Girdiniz");
        }
    }
}
