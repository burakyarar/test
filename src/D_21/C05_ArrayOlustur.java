package D_21;

import java.util.Arrays;
import java.util.Scanner;

public class C05_ArrayOlustur {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrayOlustur()));


    }

    public static int[] arrayOlustur() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen array uzunlugu giriniz");

        int uzunluk = scanner.nextInt();

        int[] arr = new int[uzunluk]; // [0,0,0,...]

        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            scanner = new Scanner(System.in);

            System.out.println("array'in " + index + " indexli elementini giriniz");
            arr[i] = scanner.nextInt();

            index++;

        }

        return arr;
    }
}
