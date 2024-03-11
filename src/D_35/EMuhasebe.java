package D_35;

public class EMuhasebe extends DHastane{

    EMuhasebe(){
        System.out.println("Parametresiz Muhasebe Cons Calisti");
    }

    EMuhasebe(String str) {
        System.out.println("String Parametreli Muhasebe Cons Calisti");
    }

    EMuhasebe(int sayi) {
        this("Yusuf");
        System.out.println("Int Parametreli Muhasebe Cons Calisti");
    }
}
