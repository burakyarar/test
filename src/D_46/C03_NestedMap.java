package D_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class C03_NestedMap {

    public static void main(String[] args) {

        /*
            {
            "firstname" : "Ahmet",
            "lastname" : "Bulut",
            "totalprice" : 500,
            "depositpaid" : false,
            "bookingdates" : {
                "checking" : "2023-07-21",
                "checkout" : "2023-08-10"
                },
            "additionalneeds" : "wi-fi"}

            Jason
         */

        List<Object> havuz = new ArrayList<>();
        havuz.add(78);
        havuz.add("Java");
        havuz.add(true);
        havuz.add('K');
        havuz.add(new int[3]);
        havuz.add(new ArrayList<String>());

        System.out.println(havuz); // [78, Java, true, K, [I@5b464ce8, []]

        System.out.println((Integer) havuz.get(0) * 2); // 156

        System.out.println(((String) havuz.get(1)).substring(2)); // va

        /*
            data turunu Object gibi Jeneric bir data turu secmek
            istedigmiz elementi bu list'e koymak icin guzel
            AMA
            elemanlarla ilgili islemler yapmak istedigimizde surekli
            olarak Casting yapmamiz gerekir

         */
    }
}
