package D_09;

import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.Scanner;

public class C05_Ternary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        System.out.println("Lutfen iki sayi giriniz");

        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        System.out.println(sayi1 > sayi2 ? sayi2 : sayi1);
        */


        System.out.println("Lutfen Bir Sayi Giriniz");

        double sayi = scanner.nextDouble();

        System.out.println(sayi > 0 ? sayi : -1 * sayi);

    }
}
