package D_28;

public class C01_ConstructorCall {

    C01_ConstructorCall() {
        System.out.println("Parametresiz cosntructor calisti");
    }

    C01_ConstructorCall(String str) {

        this(4); // constructor call
        C01_ConstructorCall(4); // method call
        System.out.println("String parametreli constructor calisti");
    }

    C01_ConstructorCall(int a) {
        System.out.println("int parametreli constructor calisti");
    }

    static void C01_ConstructorCall(int sayi) {
        System.out.println("int parametreli method calisti");
    }

    public static void main(String[] args) {

        C01_ConstructorCall obj1 = new C01_ConstructorCall("Merhaba Televole");
        // int parametreli constructor calisti
        // int parametreli method calisti
        // String parametreli constructor calisti

    }
}
