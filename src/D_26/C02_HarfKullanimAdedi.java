package D_26;

public class C02_HarfKullanimAdedi {

    public static void main(String[] args) {

        String cumle = "Java her gecen gun daha zevkli hale geliyor";

        String harf = "a";

        String[] cumleArr = cumle.split("");

        int sayac = 0;

        for (String each: cumleArr
             ) {
            if (each.equals(harf)) {
                sayac++;
            }
        }

        if (sayac == 0) {
            System.out.println("Aradiginiz harf cumlede kullanilmamis");
        } else {
            System.out.println("Aranan '" + harf + "' harfi " + sayac + " cumlede kere kullanilmis");
        }


    }
}
