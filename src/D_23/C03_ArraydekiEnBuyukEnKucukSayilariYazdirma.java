package D_23;

public class C03_ArraydekiEnBuyukEnKucukSayilariYazdirma {

    public static void main(String[] args) {

        int[][] arr = {{3,6,8},{2,5,9},{1,3},{12,23,34}};

        enBuyukEnKucukYazdir(arr);

        //En Kucuk Sayi: 1
        //En Buyuk Sayi 34



    }

    public static void enBuyukEnKucukYazdir(int[][] arr) {

        int enKucukSayi = arr[0][0];
        int enBuyukSayi = arr[0][0];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] < enKucukSayi) {
                    enKucukSayi = arr[i][j];
                }

                if (arr[i][j] > enBuyukSayi) {
                    enBuyukSayi = arr[i][j];
                }

            }

        }

        System.out.println("En Kucuk Sayi: " + enKucukSayi +
                         "\nEn Buyuk Sayi " + enBuyukSayi);
    }
}
