package D_15;

public class C06_SubStringimiz {
    public static void main(String[] args) {

        String str = "Java Candir";

        int bas = 3;
        int bit = 7;

        /*
            - bit < bas ==> hata mesaji
            - bas || bit degerleri index degerleriyle uyusmuyorsa ==> hata mesaji
            - degerler uygunsa ==> bas index'inden(dahil) bit index'ine(haric) kadar karakterleri yazdirin
         */

        if (bas > bit) {
            System.out.println("Baslangic Degeri Bitis Degerinden Buyuk Olamaz");
        } else if (bas < 0 || bit < 0 || bas >= str.length() || bit >= str.length()) {
            System.out.println("Hatali Index");
        } else {
            for (int i = bas; i < bit; i++) {
                System.out.print(str.charAt(i));
            }
        }

        System.out.println("");

        System.out.println(str.substring(bas,bit));

        str.substring(4);
        /*
            Bu method bize 4. index'ten sonuna kadar olan kismi döndürür.
            ancak
            yazdirmazsak veya bir variable'a atamazsak
            bu method'un sonucu bir ise yaramaz
         */

        String bolum = str.substring(4); // kaydeder ama yazdirmaz

        System.out.println(str.substring(5)); // yazdirir ama kaydetmez

    }
}
