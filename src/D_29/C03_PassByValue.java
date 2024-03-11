package D_29;

import javax.security.auth.login.CredentialException;

public class C03_PassByValue {

    public static void main(String[] args) {

        int sayi = 10;

        // sayi cift ise *2
        // sayi tek ise +5

        System.out.println("method call'dan once sayi: " + sayi); // method call'dan once sayi: 10

        sayi = sayiyiDegistir(sayi);

        System.out.println("method call'dan sonra sayi: " + sayi); // method call'dan sonra sayi: 20

    }

    public static int sayiyiDegistir(int sayi){

        if (sayi % 2 == 0) {
            return 2*sayi;
        } else {
            return sayi+5;
        }

    }
}
