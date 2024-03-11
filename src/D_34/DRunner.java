package D_34;

public class DRunner {

    public static void main(String[] args) {

        Corolla corolla = new Corolla();

        // Corolla class'indaki ozellikler
        System.out.println(corolla.uretimYeri); // Sakarya / Turkiye
        System.out.println(corolla.model); // Corolla
        System.out.println(corolla.aku); // Inci Aku
        System.out.println(corolla.sanziman); // CVT

        // Toyota class'indaki ozellikler
        System.out.println(corolla.marka); // Toyota
        System.out.println(corolla.lastik); // Toyota'lar Pirelli Lastik Kullanir
        System.out.println(corolla.guvenlik); // Toyota'lar Extra Guvenlik Icerir
        System.out.println(corolla.fren); // Toyota'lar ABS Fren Sistemi Kullanir

        // Araba class'indaki ozellikler
        System.out.println(corolla.yakit); // Yakit Turu Belirtilmedi
        System.out.println(corolla.yil); // 1900
        System.out.println(corolla.renk); // Renk Belirtilmedi
        corolla.yakit = "Benzin";
        System.out.println(corolla.yakit); // Benzin

    }
}
