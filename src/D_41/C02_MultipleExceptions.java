package D_41;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_MultipleExceptions {

    public static void main(String[] args) {

        String str = "Java Candir";
        int[] arr = {3,5,7,8,2,5,9,8};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Index numarasi giriniz");

        int girilenIndex = 0;


        /* 1 - birden fazla try/catch blogu olusturabiliriz

        try {
            girilenIndex = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Sayi istenildi");
        }

        try {
            System.out.println(str.charAt(girilenIndex));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Girilen index String sinirlari disinda");
        }

        try {
            System.out.println(arr[girilenIndex]);
        } catch (Exception e) {
            System.out.println("Girilen index array sinirlari disinda");
        }

        */



        /* 2 - bir try birden fazla catch yazabiliriz

        try {
            girilenIndex = scanner.nextInt();
            System.out.println(str.charAt(girilenIndex));
            System.out.println(arr[girilenIndex]);
        } catch (InputMismatchException e) {
            System.out.println("Sayi istenildi");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Girilen index String sinirlari disinda");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girilen index array sinirlari disinda");
        }

        */



        /* 3 - olasi tum exceptionlari kapsayan genis capsamli bir exception varsa
               sadece o kullanilarak tek bir catch yazilabilir

        try {
            girilenIndex = scanner.nextInt();
            System.out.println(str.charAt(girilenIndex));
            System.out.println(arr[girilenIndex]);
        } catch (RuntimeException e) {
            System.out.println("Bir Hata ile karsilasildi");
            e.printStackTrace();
        }

         */

    }

    /*
        Birden fazla exception olasigi olabilir

        - ArrayIndexOutOfBoundsException
        - StringIndexOutOfBoundsException olusma olasiliklari var

        Birden fazla exception olasiligi varsa
        asagidaki adimlar ile ilerlemek gerekir

        1 - olusmasi muhetemel exceptionlar icin parent/child iliskisi varsa
            - her biri icin bir ayri try/catch
            - bir try, her bir exception icin ayri catch
            - bir try ve olasi tum exceptionlar icin genel bir catch

        2 - olusmasi muhtemel exceptionlar arasinda parent/child iliskis varsa
            - birden fazla catch cumlesi yazilacaksa once child sonra parent yazilabilir
            - sadece parent yazilabilir

     */
}
