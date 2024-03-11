package D_39;

import D_37.AParent;

import java.util.List;

public class C01_ChildOf2Interfaces extends AParent implements I01_Interfaces, I02_Interfaces{


    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public int method11() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public void method44() {

    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {
        I01_Interfaces.super.method5();
    }

    public void methodChild() {

    }

    public static void main(String[] args) {

        System.out.println(sayi2);

        System.out.println(I02_Interfaces.sayi4);
    }

}
