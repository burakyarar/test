package D_41;

import java.util.Arrays;
import java.util.Objects;

public class C04_NumberFormatException_ClassCastException {

    public static void main(String[] args) {

        String str = "java icin bulunan sonuc sayisi : 4567, listenen sonuc sayisi: 25";

        String[] kelimeler = str.split(" ");
        // System.out.println(Arrays.toString(kelimeler)); // [java, icin, bulunan, sonuc, sayisi, :, 4567,, listenen, sonuc, sayisi:, 25]

        String sonucSayisiStr = kelimeler[6];

        // int sonucSayisiInt = Integer.parseInt(sonucSayisiStr); // NumberFormatException

        sonucSayisiStr = sonucSayisiStr.replaceAll("\\D","");
        int sonucSayisiInt = Integer.parseInt(sonucSayisiStr);

        System.out.println((sonucSayisiInt));

        String str2 = "Java";
        // Integer sayi = str2;

        Object obj = str2; // object String'in parent'i
        Integer sayi = (Integer) obj; // Integer object'in child'i oldugu icin cast edilebilir
        // ClassCastException
        System.out.println(sayi);


    }
}
