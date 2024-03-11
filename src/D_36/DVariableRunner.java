package D_36;

public class DVariableRunner {

    public static void main(String[] args) {

        CAvciKuslar avciKusKartal = new CAvciKuslar();
        System.out.println(avciKusKartal.hareket); // C ucarlar
        System.out.println(avciKusKartal.beslenme); // C et yerler
        System.out.println(avciKusKartal.pence); // C pencelidir
        System.out.println(avciKusKartal.gaga); // C sivri gagalidir
        System.out.println(avciKusKartal.kanat); // B kanatlidirlar
        System.out.println(avciKusKartal.solunum); // B akcigerle nefes alirlar
        System.out.println(avciKusKartal.cogalma); // B yumurtayla cogalirlar
        System.out.println(avciKusKartal.omur); // A yasar ve olurler

        BKuslar kusKartal = new CAvciKuslar();
        System.out.println(kusKartal.hareket); // A hareket ederler
        System.out.println(kusKartal.beslenme); // A beslenirler
        // System.out.println(kusKartal.pence); // B veya A'da yok, CTE
        System.out.println(kusKartal.gaga); // B gagalari vardir
        System.out.println(kusKartal.kanat); // B kanatlidirlar
        System.out.println(kusKartal.solunum); // B akcigerle nefes alirlar
        System.out.println(kusKartal.cogalma); // B yumurtayla cogalirlar
        System.out.println(kusKartal.omur); // A yasar ve olurler

        AHayvan hayvanKartal = new CAvciKuslar();
        System.out.println(hayvanKartal.hareket); // A hareket ederler
        System.out.println(hayvanKartal.beslenme); // A beslenirler
        // System.out.println(hayvanKartal.pence); // A'da yok, CTE
        // System.out.println(hayvanKartal.gaga); // A'da yok, CTE
        // System.out.println(hayvanKartal.kanat); // A'da yok, CTE
        System.out.println(hayvanKartal.solunum); // A nefes alirlar
        System.out.println(hayvanKartal.cogalma); // A cogalirlar
        System.out.println(hayvanKartal.omur); // A yasar ve olurler

    }

    /*

        Java'da en klasik obje olusturma yontemi

        ClassAdi obj = new ClassAdi();

        ama child class'in consturctor'i kullanilarak
        olusturulan objeler icin data turu parent class'lar olarak secilebilir

        Eger constructor ve data turu farkliysa
        objenin ozelliklerini aramaya DATA TURU olan class'dan baslanir

        Eger ozellikler variable olarak olusturulduysa
        objenin ozelliklerini DATA TURU belirler

     */
}
