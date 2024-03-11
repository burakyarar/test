package D_07;

import java.util.Scanner;

public class C10_IfElse_Exercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Kilonuzu KG Olarak Giriniz");

        double kilo = scanner.nextDouble();

        System.out.println("Lutfen Boyunuzu CM Olarak Giriniz");

        double boy = scanner.nextDouble();

        double indeks = kilo * 10000 / (boy * boy);

        // System.out.println(indeks);

        if (indeks >= 30) {
            System.out.println("Obez");
        } else if (indeks >= 25) { // No need : && indeks < 30
            System.out.println("Kilolu");
        } else if (indeks >= 20) { // No need : && indeks < 25
            System.out.println("Normal");
        } else if (indeks <=20) {
            System.out.println("Zayif");
        }

    }
}
