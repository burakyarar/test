package A_Betul;

import java.util.Scanner;

public class B_05_151123 {

    public static void main(String[] args) {

        /*
            Ememklilik yasi hesaplama
            Kulllanicidan yasini ve cinsiyetini alin
            Emekli olabiliyorsa soyleyin
            Olamiyorsa kac yili kaldigini soyleyin
         */

        String str = "Ali Baba Nerde?";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();

        boolean flag = true;

        if (yas <= 0) {

            System.out.println("Dog da gel");

            flag = false;

        } else if (yas >= 100) {

            System.out.println("Olmussun aglayanin yok");

            flag = false;

        }

        if (flag) {

            System.out.println("Lutfen cinsiyetinizi giriniz");
            String cinsiyet = scanner.next().toLowerCase();

            if (cinsiyet.equals("kadin")) {

                if (yas >= 60) {
                    System.out.println("Emekli olabilirsiniz");

                } else System.out.println("Emekliliginize " + (60 - yas) + " yil kaldi");

            } else if (cinsiyet.equals("erkek")) {

                if (yas >= 65) {
                    System.out.println("Emekli olabilirsiniz");

                } else System.out.println("Emekliliginize " + (65 - yas) + " yil kaldi");

            } else System.out.println("Lutfen gecerli bir cinsiyet giriniz");
        }

    }
}
