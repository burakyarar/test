package D_33;

public class C05_Runner {

    public static void main(String[] args) {

        C04_Okul okul = new C04_Okul();

        System.out.println(okul.getOkulAdi()); // Yildiz Koleji

        okul.setOkulAdi("Java Koleji");

        System.out.println(okul.getOkulAdi()); // Java Koleji

        System.out.println(okul.okulAdresi); // Ankara

        okul.okulAdresi = "Ankara / Cankaya";

        System.out.println(okul.okulAdresi); // Ankara / Cankaya
    }
}
