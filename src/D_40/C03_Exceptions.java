package D_40;

import java.util.Scanner;

public class C03_Exceptions {

    public static void main(String[] args) {

        // 2 tam sayi al
        // birbirine bol ve yazdir

        Scanner scanner = new Scanner(System.in);
        System.out.println("2 tam sayi giriniz");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        /*
        if (sayi2 == 0) {
            System.out.println("Ikinci sayi 0 olamaz");
        } else {
            System.out.println(sayi1 / sayi2);
        }
        */

        try {
            System.out.println(sayi1 / sayi2);
        } catch (ArithmeticException e) {
            System.out.println("Ikinci sayi 0 olamaz");
        }
        /*
            normal sartlarda bir sorun yok
            ama istisnai olarak sayi2 = 0 verilirse
            tanimsiz oldugu icin java ne yapacagini bilemez

            kodu yazarken bu ihtimali on gormeli ve
            java'ya yapmasi gerekeni soylemeliyiz



         */
    }
}
