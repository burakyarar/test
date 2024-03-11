package D_43;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList_List {

    public static void main(String[] args) {

        List<String> isimler = new LinkedList<>();

        isimler.add("Omer");
        isimler.add("Cemil");
        isimler.add("Nergiz");

        List<String> ikinciList = new LinkedList<>();


        ikinciList.add("Mustafa");
        ikinciList.add("Cemil");

        System.out.println(isimler.retainAll(ikinciList)); // true

        System.out.println(isimler); // [Cemil]
        // Ortak elemanlarin disindaki tum elemanlari siler

        ikinciList.retainAll(isimler);

        System.out.println(ikinciList); // [Cemil]



    }
}
