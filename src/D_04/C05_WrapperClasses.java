package D_04;

public class C05_WrapperClasses {

    public static void main(String[] args) {

        String str = "Java";

        System.out.println(str.charAt(3) ); // a

        /*
            Java primitive data turleri icin hazir method olusturamaz
            Ancak
            Primitive data turleri icinde hazir method'lar kullanabilecek
            Wrapper Class'lar olusturmustur

            int => Integer
            char => Character

            short => Short
            double => Double ...

            Wrapper Class'lar Primitive data turleri ile hic problemsiz atama yapilabilir
         */

        int sayi1 = 5;

        Integer sayi2 = sayi1;

        int sayi3 = sayi2;

        System.out.println(Integer.MIN_VALUE); // -2147483648
        System.out.println(Integer.MAX_VALUE); //  2147483647

        // Short sayi4 = (Short) sayi3;
        // Wrapper Class'lar arasinda Casting, Auto Widening, ve Explicit Narrowing olmaz!

        // Sayisal ifade bulunan bir String'de matematiksel islem yapmak gerekirse

        String str1 = "11";
        String str2 = "22";

        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2)); // 33

        char ch1 = '5';



        System.out.println(Character.isDigit(ch1));
        System.out.println(Character.isLetter(ch1));
        System.out.println(Character.isWhitespace(ch1));
        System.out.println(Character.charCount(ch1));
        System.out.println(Character.isUpperCase(ch1));

    }
}
