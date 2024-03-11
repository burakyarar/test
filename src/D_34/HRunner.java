package D_34;

public class HRunner {

    public static void main(String[] args) {

        GAvciKuslar avciKusKartal = new GAvciKuslar();

        // AvciKuslar class'indan aldigi ozellikler
        avciKusKartal.hareket(); // ucarlar
        avciKusKartal.beslenme(); // et yerler
        avciKusKartal.pence(); // pencelidir
        avciKusKartal.gaga(); // sivri gagali

        // Kuslar class'indan aldigi ozellikler
        avciKusKartal.kanat(); // kanatlidirlar
        avciKusKartal.solunum(); // akcigerle nefes alirlar
        avciKusKartal.cogalma(); // yumurtalya cogalirlar

        // Hayvanlar class'indan aldigi ozellikler
        avciKusKartal.omur(); // yasar ve olurler

        avciKusKartal.toString();

    }
}
