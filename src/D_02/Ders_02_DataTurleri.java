package D_02;

public class Ders_02_DataTurleri {

    public static void main(String[] args) {

        boolean bl1=true;
        boolean bl2=false;

        char ch1='a';
        char ch2='2';
        char ch3='#';

        int Popl=805485;
        int PoplBilecik=32540;
        // Ayni data turleri hafizada ayni olcude yer kaplarlar

        short NoterNumIst=482;

        float fl1=40f;
        float fl2=12f;
        float fl3=fl1/fl2;

        System.out.println(fl3);

        double db1=fl1/fl2;

        System.out.println(db1);

        System.out.println(ch1);

        String str="Merhaba";

        System.out.println(str);

        System.out.println("str");

        System.out.println("Islem Sonucu: " + Popl+fl3*db1);

    }
}
