package D_35;

public class BToyota extends Araba {

    BToyota() { // super();
        System.out.println("Toyota parametresiz constructor calisti");
    }

    // parent class updatle'leri
    String marka = "Toyota";
    String uretimYeri = "Toyota'lar Japonya ve Turkiye'de Uretilir";

    // yeni eklenti ozellikler
    String lastik = "Toyota'lar Pirelli Lastik Kullanir";
    String guvenlik = "Toyota'lar Extra Guvenlik Icerir";
    String fren = "Toyota'lar ABS Fren Sistemi Kullanir";

}
