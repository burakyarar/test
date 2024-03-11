package D_41;

public class C05_ThrowKeyword {

    public static void main(String[] args) {

        /*
            throws: bir method'da exception olasiligi varsa
                    ve biz de o exception'i handle etmek yerine
                    sadece kodlari calisir hale getirmek icin
                    method signature'na throws keyword ile olasi
                    exception(lari)'i yazariz

            throw: method icinde istedigimiz bir satirda
                   exception olusturmak icin kullanilir
         */

        int sayi = 10;

        try {
            if (sayi % 2 == 0) {
                throw new RuntimeException();
            }
            System.out.println("kod satiri 1");
            System.out.println("kod satiri 2");
            System.out.println("kod satiri 3");

        } catch (RuntimeException e) {

            System.out.println("Sayi cift oldugu icin ilk 3 kod satiri atlandi");
        }
        
        System.out.println("kod satiri 4");
        System.out.println("kod satiri 5");

    }
}
