package D_23;

public class C02_TekSayilariYazdir {

    public static void main(String[] args) {

        int[][] arr = {{3,6,8},{2,5,9},{1,3},{12,23,34}};

        int toplam = 0;
        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] % 2 != 0) {
                    System.out.print(arr[i][j] + " "); // 3 5 9 1 3 23
                    toplam += arr[i][j];
                    sayac++;
                }
            }
        }

        System.out.println("\n" + sayac + " Tek Sayinin Toplami: " + toplam); // 6 Tek Sayinin Toplami: 44
    }
}
