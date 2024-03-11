package D_07;

public class C01_BagimsizIfCumleleri {

    public static void main(String[] args) {

        /*
            Bagimsiz if cumleleri kodun geri kalani ile ilgilenmez

            Sadece boolean sarta odaklanir
            sartin sonucu true ise if body'si calisir
            false ise devreye girmez

            Birden fazla bagimsiz if cumlesi olan bir kod calistiginda
            kac tane if body'sinin calisacagi verilen degerlere baglidir
         */
        int a = 20;
        int b = 30;

        if (a>0){ //true
            System.out.println("a sayisi pozitif");
        }

        if (a+b>100){ // false
            System.out.println("sayilarin toplami 100'den buyuk");
        }

        if (b % 3 == 0) { //true
            System.out.println("b 3'e tam bolunur");
        }

        if (b<100){ //true
            System.out.println("b 100'den kucuktur");
        }



    }
}
