package D_27;

public class C03_Araba {

    String marka = "Marka Belirtilmemis";
    String model = "Model Belirtilmemis";
    int yil = 1900;
    int fiyat;
    String renk = "Renk Belirtilmemis";

    C03_Araba () {
        // Herhangi bir class'a gorunur bir constructor
        // olusturunca default constructor silinir
        // daha oncesinde default constructor kullanan
        // baska siniflar sorun olusturur
        // GENEL UYGULAMA OLARAK
        // soruna sebebiyet vermemesi icin defualt yerine
        // parametresiz bir constructor olusturmaliyiz
    }

    C03_Araba(String mrk, String mdl, int yl, int fyt, String rnk) {

        marka = mrk;
        model = mdl;
        yil = yl;
        fiyat = fyt;
        renk = rnk;
    }






    @Override
    public String toString() {
        return "C03_Araba ==> " +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                ", renk='" + renk;
    }
}
