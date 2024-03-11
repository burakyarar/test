package D_27;

public class C05_Araba {

    String marka = "Marka Belirtilmemis";
    String model = "Model Belirtilmemis";
    int yil = 1900;
    int fiyat;
    String renk = "Renk Belirtilmemis";

    public C05_Araba() {
    }

    public C05_Araba(String marka, String model, int yil, int fiyat, String renk) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
        this.renk = renk;
    }

    public C05_Araba(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }

    public C05_Araba(String marka, int yil, int fiyat) {
        this.marka = marka;
        this.yil = yil;
        this.fiyat = fiyat;
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


