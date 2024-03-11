package D_36;

public class HMethodRunner {

    public static void main(String[] args) {

        GAvciKuslar avciKusKartal = new GAvciKuslar();
        avciKusKartal.hareket(); // C ucarlar
        avciKusKartal.beslenme(); // C et yerler
        avciKusKartal.pence(); // C pencelidir
        avciKusKartal.gaga(); // C sivri gagali
        avciKusKartal.kanat(); // B kanatlidirlar
        avciKusKartal.solunum(); // B akcigerler nefes alirlar
        avciKusKartal.cogalma(); // B yumurtayla cogalirlar
        avciKusKartal.omur(); // A yasar ve olurler

        FKuslar kusKartal = new GAvciKuslar();
        kusKartal.hareket(); // C ucarlar
        kusKartal.beslenme(); // C et yerler
        // kusKartal.pence(); // B ve A'da yok, CTE
        kusKartal.gaga(); // C sivri gagali
        kusKartal.kanat(); // B kanatlidirlar
        kusKartal.solunum(); // B akcigerler nefes alirlar
        kusKartal.cogalma(); // B yumurtayla cogalirlar
        kusKartal.omur(); // A yasar ve olurler

        EHayvanlar hayvanKartal = new GAvciKuslar();
        hayvanKartal.hareket(); // C ucarlar
        hayvanKartal.beslenme(); // C et yerler
        // kusKartal.pence(); // A'da yok, CTE
        // hayvanKartal.gaga(); // A'da yok, CTE
        // hayvanKartal.kanat(); // A'da yok, CTE
        hayvanKartal.solunum(); // B akcigerler nefes alirlar
        hayvanKartal.cogalma(); // B yumurtayla cogalirlar
        hayvanKartal.omur(); // A yasar ve olurler

    }

}
