package D_07;

import java.util.Scanner;

public class C12_IfElse_Exercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
            Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
            sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
            "istediginiz birim sisteme kayitli degil" yazdirin.
         */

        System.out.println("Mesafeyi Kilometre Cinsinden Giriniz");

        double mes = scanner.nextDouble();
        double mt = mes * 1000;
        double cm = mt * 100;
        double ft = cm * 30.48;
        double in = cm * 2.54;
        ft = 12 * in;
        mt = 3.28084 * ft;


        System.out.println("Hangi Birime Cevirmek Istediginiz Giriniz");

        String birim = scanner.next();

        boolean m;
        boolean c;

        if (birim.equals("m")) {
            System.out.println("Mesafe: " + mt + " cm");
        } else if (birim.equals("cm")) {
            System.out.println("Mesafe: " + cm + " cm");
        } else if (birim.equals("ft")) {
                System.out.println("Mesafe: " + ft + " ft");
        } else if (birim.equals("in")) {
            System.out.println("Mesafe: " + in + " in");
        } else {
            System.out.println("Istediginiz Birim Sisteme Kayitli Degil");
        }

        // System.out.println(m);
        // System.out.println(c);

    }
}
