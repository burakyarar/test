package D_16;

public class C01_methodOlusturma {

    // Soru 1- Kullanicidan input olarak verilen bir String,
    //         baslangic ve bitis indexlerine gore
    //         baslangic index’i dahil, bitis index’i haric olacak sekilde
    //         aradaki harfleri yazdiran bir method olusturun.
    //          - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
    //          - kullanici str’da olan index’lerden daha buyuk bir index girerse hata mesaji yazdirin.

    public static void main(String[] args) {

        altString("Java guzeldir",3,7); // a gu
        altString("Biraz sabir lutfen",5,4); // Baslangic Index Bitis Index'ten Buyuk Olamaz
        altString("Bu da mi gol degil ?", 11,33); // Verilen Index Sinirlarin Disinda

        String str = "Aramiz bozulmasin";
        altString(str,5,10); // z boz
    }   // main method sonu

    public static void altString(String metin, int basIndex, int bitIndex){

        if (basIndex > bitIndex) {
            System.out.println("Baslangic Index Bitis Index'ten Buyuk Olamaz");
        } else if (basIndex >= metin.length() || bitIndex >= metin.length()) {
            System.out.println("Verilen Index Sinirlarin Disinda");
        } else {

            for (int i = basIndex; i < bitIndex; i++) {
                System.out.print(metin.charAt(i));
            }
        }
        System.out.println("");
    }


}   // class sonu
