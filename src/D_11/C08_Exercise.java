package D_11;

import java.util.Scanner;

public class C08_Exercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir Metin Giriniz");
        String metin = scanner.nextLine();

        System.out.println("Aramak Istediginiz Metni veya Kelimeyi Giriniz");
        String ara = scanner.nextLine();

        int sira = metin.indexOf(ara);

        if (metin.contains(ara)) {
            if (metin.substring(sira + 1).contains(ara)) {
                System.out.println("Aranan Metin Birden Fazla Kullanilmis");
            } else System.out.println("Aranan Metin Index " + sira + "'de/da Bir Kez Kullanilmis");
        } else System.out.println("String Aranan Metni Icermiyor");
    }
}
