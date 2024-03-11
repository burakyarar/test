package D_40;

public interface I01_Interfaces {

    int sayi = 10;
    final int sayi2 = 20;
    static int sayi3= 30;
    public int sayi4 = 40;
    public static final int sayi5 = 50;

    void method1();

    abstract int method2();
    public String method3();

    public abstract void method4();

    public default void method5() {

    }

    public static void method6() {

    }

    /*
        java8 ile baslanan istisna ile method deklarasyonunda
        access modifier'dan sonr DEFAULT veya STATIC yazilan method'lar
        interface icinde body'si olan method'lar olabilir
        boylece tum child class'larin implements etmesi de
        ZORUNLU OLMAZ

        aralarindaki fark default keyword kullanilan method'lar
        baska class'lardan obje olusturularak kullanilabilirken
        static keyword kullanilan method'lar baska class'lardan
        classIsmi.staticmethodIsmi() seklinde kullanilabilir
     */
}
