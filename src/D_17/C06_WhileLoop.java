package D_17;

public class C06_WhileLoop {

    public static void main(String[] args) {

        // 1'den 100'e kadar olan sayilari (sinirlari dahil)
        // for loop ile hesapla

        int toplam = 0;

        for (int i = 1; i <= 100 ; i++) {

            toplam+=i;
        }

        System.out.println("for loop ole toplam: " + toplam); // for loop ole toplam: 5050

        toplam = 0;
        int i = 1;

        while (i <= 100) {

            toplam += i;

            i++;
        }

        System.out.println("while loop ile toplam: " + toplam); // while loop ile toplam: 5050
    }
}
