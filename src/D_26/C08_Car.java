package D_26;

public class C08_Car {

    String marka = "Marka Belirtilmemis";
    String model = "Model Belirtilmemis";
    int yil = 1900;
    int fiyat;
    String renk = "Yil Belirtilmemis";

    @Override
    public String toString() {
        return "Araba bilgileri ==> " +
                "marka:'" + marka + '\'' +
                ", model:'" + model + '\'' +
                ", yil:" + yil +
                ", fiyat:" + fiyat +
                ", renk='" + renk + '\'';
    }
}
