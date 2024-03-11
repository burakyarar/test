package D_19;

public class C01_Scope {

    static int classLevelStatic = 12;
    String strClassLevelStaticOlmayan = "Java Guzeldir";

    public static void main(String[] args) {

        int sayiMain = 20;
        System.out.println(classLevelStatic);
        // System.out.println(strClassLevelStaticOlmayan);

        for (int i = 0; i < 10; i++) {

            int sayiForLoop = 5;
            System.out.println(classLevelStatic);
            // System.out.println(strClassLevelStaticOlmayan);
        }
    }

    public static void staticMethod() {

        String strStaticMethod = "Java Candir";
        System.out.println(classLevelStatic);
        // System.out.println(strClassLevelStaticOlmayan);

    }

    public void staticOlmayanMethod() {

        boolean blStaticOlmayanMethod = true;
        System.out.println(classLevelStatic);
        System.out.println(strClassLevelStaticOlmayan);

    }

    /*
        Scope 2'ye ayrilir

        1- Local Variable
           a - Scope'lari icinde olusturulduklari kod blogudur
               bir method'da olusturulan variable, baska method'dan kullanilamaz
           b - Loop scope'u bir loop icerisinde olusturulan variable
               sadece o loop icerisinde kullanilabilir
               olusturuldugu method'da loop'un dusunda da kullanilamaz
          NOT: Local variable'lar deger verilmeden olusturulabilir
               ama deger atanmadan kullanilamaz

        2- Class Level Varibale
           Class Level variable'lar method'larin ve kod bloklarin disinda olusturulur
           ve scope'lari tum class'dir

           Scope'lari tum class olsa da static keyword de variable'larin kullanimina etki eder

           hastane ismi, hastane adresi, bashekim adi gibi variable'lar herkes icin ortak olmali
           bu tur variable'lar static olarak isaretlenir

           personel ismi, adresi telefonu gibi variable'lar tum personel icin tanimli olmakla birlikte
           herkesi etkilemezler, sadece o personelleri etkilerler
           bu variable'lari static yapmayiz - instance variable denir

           c - class level static variable'lar static olduklari icin her yere gidebilirler ve
               her method'da kullanilabilirler

           d - class level instance variable'lar static olmadiklari icin ustunluk olmaz
               ve secici olan method olur

               static method'lar instance variable'larin girmesine izin vermez
               static olmayan method'lar instance variable'lari kabul eder
     */
}
