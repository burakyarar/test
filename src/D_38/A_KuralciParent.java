package D_38;

public abstract class A_KuralciParent {
    public void method1() {
        System.out.println("parent method1");
    }

    public void method2() {
        System.out.println("parent method2");
    }

    public abstract void method3();

    public abstract void method4();

    public abstract void method5();

    /*

        Eger parent class'i child class'lar icin bir cati yapiyorsak
        ve parent class'a extends yapan tum child class'larin bazi method'lari
        kendisine uyarlamaya MECBUR ETMEK istiyorsak abstraction kullaniriz

        1- bir class'in bu ozellikleri saglamasi icin abstact olmasi gerekir
            - Abstract class (partial abstraction)
                bazi method'lari child'larin uyarlamasina mecbur eder
                bazilarini serbest brakir
            - Interface (full abstraction)
                tum method'lari child'larin kendisine uyarlamasini mecbur eder

        2- bir class'i abstract class yapmak istiyorsak
           deklarasyonuna abstract yazmaliyiz

        3- child class'larin mecburen uyarlamasini istedigimiz method'lari
           abstract method yapiyoruz, digerlerini olduklari gibi birakiyoruz
     */
}
