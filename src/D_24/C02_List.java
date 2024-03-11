package D_24;

import java.util.ArrayList;
import java.util.List;

public class C02_List {

    public static void main(String[] args) {

        List<String> isimler1 = new ArrayList<>();

        ArrayList<String> isimler2 = new ArrayList<>();

        isimler1.add("Burhan");
        isimler1.add("Seref");
        isimler1.add("Gulsah");

        System.out.println(isimler1); // [Burhan, Seref, Gulsah]

        isimler1.add(2,"Nergiz");

        System.out.println(isimler1); // [Burhan, Seref, Nergiz, Gulsah]

        isimler1.add(isimler1.size() / 2, "Omer");

        System.out.println(isimler1); // [Burhan, Seref, Omer, Nergiz, Gulsah]

        isimler1.addAll(2,isimler1);

        System.out.println(isimler1);
        // [Burhan, Seref, Burhan, Seref, Omer, Nergiz, Gulsah, Omer, Nergiz, Gulsah]

        System.out.println(isimler1.add("Eyup")); // true
        System.out.println(isimler1);
        // [Burhan, Seref, Burhan, Seref, Omer, Nergiz, Gulsah, Omer, Nergiz, Gulsah, Eyup]



    }
}
