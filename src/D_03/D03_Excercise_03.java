package D_03;

import java.util.Scanner;

public class D03_Excercise_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Dikdortgenin Iki Kenarini Giriniz");

        double db1 = scanner.nextDouble();
        double db2 = scanner.nextDouble();

        System.out.println("Dikdortgenin Alani: " + db1 * db2);
    }
}
