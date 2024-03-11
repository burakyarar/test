package D_39;

public interface I01_Interfaces {

    int sayi = 10;
    final int sayi2 = 20;
    static int sayi3 = 30;
    public int sayi4 = 40;
    public static final int sayi5 = 50;

    void method1();
    abstract int method2();
    public String method3 ();
    public abstract void method4();

    public default void method5() {

    }

    /*

        Bir interface'e sonradan bir abstract method eklersek
        o interface'i daha onceden implement eden tum class'lar
        yeni eklenen method'u implement etmek zorunda kalir.

        Buyuk projelerde iterface'lere sonradan eklenen method'lar
        cok fazla class'i etkileyebilir
        Developer'lardan gelen taleplere uzerine java8'den itibaren
        bu durum icin bir sitisna olusturulmustur.

        Eger bir interface'e sonradan ekledigimiz method'un
        butun child class'lari etkilemesini istemiyorsak,
        bu method'un body'si olmalidir

        java8 ile baslanan istisna ile method deklarasyonunda
        acces modifier'dan sonra DEFAULT veya STATIC yazilan method'lar
        interface icinde body'si olan method'lar olabilir
        Boylece tum child class'larin implement etmesi de ZORUNLU OLMAZ

        Aralarindaki fark:
        - default keyword kullanilan method'lar baska class'lardan
        obje olusturularak kullanilabilir
        - static keyword kullanilan method'lar baska class'lardan
        classIsmi.staticMethodIsmi() seklinde kullanilabilir

     */

}
