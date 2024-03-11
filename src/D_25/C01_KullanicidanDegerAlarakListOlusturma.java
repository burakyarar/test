package D_25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_KullanicidanDegerAlarakListOlusturma {

    public static void main(String[] args) {

        System.out.println(listOlustur());

    }

    public static List<String> listOlustur() {

        Scanner scanner;
        String girilenIsim;

        List<String> isimList = new ArrayList<>();

        do {
            scanner = new Scanner(System.in);
            System.out.println("Listeye eklemek icin isim giriniz \nBitirmek icin Q'ya basiniz");
            girilenIsim = scanner.nextLine();

            if (!girilenIsim.equalsIgnoreCase("Q")) {

                isimList.add(girilenIsim);
            }

        }while (!girilenIsim.equalsIgnoreCase("Q"));

        return isimList;

    }
}
