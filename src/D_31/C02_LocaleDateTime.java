package D_31;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class C02_LocaleDateTime {

    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();

        System.out.println(tarihSaat); // 2023-08-13 T 18:47:33.079715400

        LocalDateTime baslama = LocalDateTime.now();

        int baslangic = baslama.getNano();

        int toplam = 0;

        for (int i = 0; i < 10000; i++) {

            toplam += i;
        }

        LocalDateTime bitirme = LocalDateTime.now();
        int bitis = bitirme.getNano();

        System.out.println(bitis - baslangic); // 997400

    }
}
