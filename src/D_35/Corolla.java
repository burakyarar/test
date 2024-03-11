package D_35;

public class Corolla extends BToyota {

    Corolla() { // super();
        System.out.println("Corolla parametresiz constructor calisti");
    }

    Corolla(String str) { // super();
        // Java'nin koydugu ve gorunur olmayan
        // constructor call HER ZAMAN parametresiz
        // olan super(); constructor call'dir

        // kodu yazan isterse ilk satira baska
        // constructor call yazabilir
        // bu durumda super(); Java tarafindan silinir
    }


    String uretimYeri = "Sakarya / Turkiye";
    String model = "Corolla";
    String aku = "Inci Aku";
    String sanziman = "CVT";

    public static void main(String[] args) {

        Corolla corolla = new Corolla();
        // Araba parametresiz constructor calisti
        // Toyota parametresiz constructor calisti
        // Corolla parametresiz constructor calisti

        Corolla corolla1 = new Corolla("Kirmizi");

    }
}
