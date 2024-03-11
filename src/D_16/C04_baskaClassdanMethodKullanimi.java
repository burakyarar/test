package D_16;

public class C04_baskaClassdanMethodKullanimi {

    public static void main(String[] args) {

        C01_methodOlusturma.altString("Method",1,3); // et

        System.out.println(C03_methodOlusturma.isimDuzenle("bugra", "CAN")); // Bugra Can

        String isimDuzenli = C03_methodOlusturma.isimDuzenle("mehmet","kemal");

        System.out.println(isimDuzenli); // Mehmet Kemal

        System.out.println(isimDuzenli.length()); // 12
    }
}
