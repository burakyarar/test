package D_33;

public class C01_Pazarlama {

    /*
        satis degeri girecekler girebilsin
        baskalarinin girdigi satislari goremesin

        toplamSatis degerini gormesi gerekneler gorsun
        gorenler tarafindan degistirilmesin
     */
    private int toplamSatis; // read only
    private int satis; // write only

    /*
        yetki ayirimi yapacagimiz class'larda istedigimiz islemi
        bizim adimiza yapacak public method'lar olusturacagiz

        getter method baska class'lar icin private variable'lara
        ulasir ve degerini o class'lara dondurur
     */

    public int getToplamSatis() {

        return toplamSatis;
    }

    public void setSatis(int satis) {
        this.satis = satis;
        toplamSatisaEkle();
    }

    private void toplamSatisaEkle() {
        toplamSatis += satis;
    }
}
