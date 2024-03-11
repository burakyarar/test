package D_29;

import D_28.C01_ConstructorCall;

public class C01_staticBlocks {

    C01_staticBlocks() {
        System.out.println("Parametresiz constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");

        C01_staticBlocks obj = new C01_staticBlocks();

        System.out.println("obje olusturuldu");

    }

    static {
        System.out.println("static block 1 calisti");
    }

    static {
        System.out.println("static block 2 calisti");
    }

    {
        System.out.println("static olmayan block calisti");
    }
}
