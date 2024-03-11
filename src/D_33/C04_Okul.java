package D_33;

public class C04_Okul {

    private String okulAdi = "Yildiz Koleji";
    private int ogrenciSayisi = 234;
    public String okulAdresi = "Ankara";

    /*
        bazi developer'lar
        erisim yetkisini sinirlamak icin degil de
        yapilan ise vurgu olmasi icin getter ve setter kullanabilirler
     */

    public void setOkulAdi(String okulAdi) {
        this.okulAdi = okulAdi;
    }

    public void setOgrenciSayisi(int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }

    public String getOkulAdi() {
        return okulAdi;
    }

    public int getOgrenciSayisi() {
        return ogrenciSayisi;
    }
}
