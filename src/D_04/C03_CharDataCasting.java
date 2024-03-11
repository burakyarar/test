package D_04;

public class C03_CharDataCasting {

    public static void main(String[] args) {

        char ch1 = 'e';

        int sayi1 = ch1;

        System.out.println("ch1: " + ch1);
        System.out.println("sayi1: " + sayi1);

        /*
            char data turundeki bir variable matematiksel
            bir islemde kullanilirsa harfin ASCII tablosundaki
            degeri isleme girer
         */

        int sayi2 = 225;
        char ch2 = (char) sayi2;

        System.out.println(ch2); // á

        char ch3 = 'a';
        char ch4 = 'b';

        System.out.println(ch3 + ch4); // 97 + 98 = 195
    }
}
