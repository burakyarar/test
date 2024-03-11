package D_21;

public class C04_ElementSay {

    public static void main(String[] args) {

        int[] arr = {3,5,2,3,5,6,7,1,8};
        int arananSayi = 5;

        elemanSay(arr,arananSayi); // Aranan 5 sayisi arrey'de 2 kere kullanilmis

    }

    public static void elemanSay (int[] arr, int arananSayi) {

        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == arananSayi) {
                sayac++;
            }

        }

        if (sayac == 0) {
            System.out.println("Aranan sayi array'de yok");
        } else {
            System.out.println("Aranan " + arananSayi + " sayisi arrey'de " + sayac + " kere kullanilmis");
        }


    }
}
