package D_09;

import java.util.Scanner;

public class C04_Ternary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ucgenin Kenar Uzunluklarini Giriniz");

        double knr1 = scanner.nextDouble();
        double knr2 = scanner.nextDouble();
        double knr3 = scanner.nextDouble();

        System.out.println(knr1 == knr2 && knr1 == knr3 && knr1 > 0 ? "Eskenar Ucgen" : "Eskenar Ucgen Degil");

    }
}
