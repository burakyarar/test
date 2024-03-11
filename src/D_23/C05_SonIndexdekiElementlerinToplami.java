package D_23;

public class C05_SonIndexdekiElementlerinToplami {

    public static void main(String[] args) {

        int[][] sayilar = {{3,4,5},{1,4},{5,2,7},{1,9,0,3},{4}};

        sonElementlerinToplami(sayilar); // Son Elementler Toplami: 23
    }

    public static void sonElementlerinToplami (int[][] sayilar) {

        int toplam = 0;

        // int[] sonElementler = sayilar[sayilar.length - 1];

        /*
        for (int i = 0; i < sayilar.length; i++) {

            for (int j = 0; j < sayilar[i].length; j++) {

                if (j == sayilar[i].length - 1) {
                    toplam += sayilar[i][j];
                }
            }

        }
        */

        for (int i = 0; i < sayilar.length; i++) {

            toplam += sayilar[i][sayilar[i].length - 1];
        }

        System.out.println("Son Elementler Toplami: " + toplam);
    }
}
