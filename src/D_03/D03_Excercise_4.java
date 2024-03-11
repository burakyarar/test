package D_03;

import java.util.Scanner;

public class D03_Excercise_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Cemberin Yaricapini Giriniz");

        double r = scanner.nextDouble();

        double pi = 3.14159265;

        System.out.println("Cemberin Cevresi: " + 2*pi*r);
        System.out.println("Cemberin Alani: " + pi*r*r);


    }
}
