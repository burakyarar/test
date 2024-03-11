package D_36;

public class KChildClass extends JParentClass{

    public void method1() {
        System.out.println("child class method1");
    }

    @Override // parent class'dan method2'nin silinmesi CTE verir
    public void method2() {
        super.method2();
        System.out.println("child class method2");
    }

    /*

        @Override notasyonu overridden method ile
        overriding method'u birbirine baglar
        eger overridden method silinirse CTE verir

        Kullanmak zorunda degiliz ama
        iki method'u bagimli yapmak icin kullanilabilir

        overriding method varken
        overridden method calismaz

        her iki method'u birden calistirmak istersek
        child class'daki overriding method'a
        super.method2(); ekleyebiliriz

     */
}
