package D_32;

public class C06_Runner {

    public static void main(String[] args) {

        C05 obj = new C05();

        // System.out.println(obj.privateSayi);
        // private olanlara class disindan ulasilamaz

        System.out.println(obj.defaultSayil); // 0
        obj.defaultSayil = 20;
        System.out.println(obj.defaultSayil); // 20

        System.out.println(obj.protectedSayi); // 0
        obj.protectedSayi = 30;
        System.out.println(obj.protectedSayi); // 30

        System.out.println(obj.publicSayi); // 0
        obj.publicSayi = 50;
        System.out.println(obj.publicSayi); // 50

    }
}
