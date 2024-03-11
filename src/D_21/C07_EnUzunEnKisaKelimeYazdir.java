package D_21;

public class C07_EnUzunEnKisaKelimeYazdir {

    public static void main(String[] args) {

        String[] isimler = {"Resul","Omer","Mehmet","Ertugrul","Ozan","Suleyman"};

        enUzunEnKisaYazdir(isimler);

    }

    public static void enUzunEnKisaYazdir(String[] isimler) {

        String enUzunKelime = isimler[0];
        String enKisaKelime = isimler[0];

        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].length() > enUzunKelime.length()) {
                enUzunKelime = isimler[i];
            }

            if (isimler[i].length() < enKisaKelime.length()) {
                enKisaKelime = isimler[i];
            }

        }

        System.out.println("En Uzun Isim: " + enUzunKelime);
        System.out.println("En Kisa Isim: " + enKisaKelime);
    }
}
