package D_03;

import java.util.Scanner;

public class D03_Excercise_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Isminizi Giriniz");

        String Isim = scanner.nextLine();

        System.out.println("Lutfen SoyIsminizi Giriniz");

        String SoyIsim = scanner.next();

        System.out.println("Lutfen Yasinizi Giriniz");

        int Yas = scanner.nextInt();

        /*
        System.out.println("Isminiz    : " + Isim);
        System.out.println("SoyIsminiz : " + SoyIsim);
        System.out.println("Yasiniz    : " + Yas);

        System.out.println("Kayit Islemi Basariyla Tamamlanmistir");

         */

        // sout icerisindeki bir String'in yazdirilmasina alt satirdan devam edilmesini isterseniz String'in
        // alt satira gecmesini istediginiz kisminda \n yazin

        System.out.println("Isminiz    : " + Isim + "\nSoyIsminiz : " + SoyIsim + "\nYasiniz    : " + Yas);
        System.out.println("Kayit Islemi Basariyla Tamamlanmistir");


    }
}
