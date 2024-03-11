package D_26;

public class C07_Runner {

    public static void main(String[] args) {

        C04 obj; // niyet, proje var bina yok
        // declaration var ama ete kemige burunmus obje yok

        new C04();
        // obje olusturuldu ama sonraki satirlarda kullanilamaz
        // cunku bir obje'ye atanmadi

        System.out.println(new C04().sayi); // 10

        C04 obj2 = new C04(); // tam bir obje olusturma

    }
}
