package D_27;

public class C02_HastaneRunner {

    public static void main(String[] args) {

        C01_Hastane personel1 = new C01_Hastane();

        System.out.println(personel1); // D_27.C01_Hastane@5594a1b5

        System.out.println(personel1.personelIsmi); // Isim Atanmadi
        System.out.println(personel1.personelTel); // 5552555565
        System.out.println(personel1.hastaneAdi); // Yildiz Hastanesi
        System.out.println(personel1.hastaneTel); // Telefon Atanmadi

        personel1.personelTel = "222663558";
        personel1.personelIsmi = "Mertkan";

        C01_Hastane personel2 = new C01_Hastane();

    }
}
