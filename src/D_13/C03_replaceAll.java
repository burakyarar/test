package D_13;

import java.util.Scanner;

public class C03_replaceAll {

    public static void main(String[] args) {

        // Kullanicidan bir metin al
        // metindeki tum sayilari ve space disindaki ozel karakterleri temizle
        // metnin sonuna eger yoksa . koy
        // Ornek : J1*2av4.a C67/an=+dir--"

        Scanner scanner = new Scanner(System.in);
        String girdi = scanner.nextLine();

        girdi = girdi.replaceAll("\\d" ,"");

        girdi = girdi.replaceAll("\\s" , "1");

        girdi = girdi.replaceAll("\\W" ,"");

        girdi = girdi.replaceAll("1" , " ");

        if (girdi.endsWith(".")) {
            System.out.println("Temizlenmis Metin: " + girdi);
        } else System.out.println("Temizlenmis Metin: " + girdi + ".");

        // girdi.endsWith(".") ? System.out.println("Temizlenmis Metin: " + girdi) : System.out.println("Temizlenmis Metin: " + girdi + ".");


    }
}
