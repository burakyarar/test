package D_22;

import java.util.Arrays;
import java.util.Scanner;

public class C07_KullanicidanSayiAlipArrayeEkle {

    public static void main(String[] args) {

        int[] arr = {3,5,8};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Eklemek istediginiz sayiyi giriniz");
        int eklenecekSayi = scanner.nextInt();

        arr = C06_ArreyeBirElemanEkleme.arrayeBirElemanEkle(arr, eklenecekSayi);

        arr = C06_ArreyeBirElemanEkleme.arrayeBirElemanEkle(arr, 11);

        System.out.println(Arrays.toString(arr));

    }
}
