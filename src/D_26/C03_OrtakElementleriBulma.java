package D_26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C03_OrtakElementleriBulma {

    public static void main(String[] args) {

        Integer[] arr1 = {3,5,8,1,3,9,2,4,7,13,15};
        Integer[] arr2 = {2,7,3,5,8,1,9,0,3,52,7};

        List<Integer> ortakElemanlarListesi = new ArrayList<>();

        for (Integer each1: arr1
             ) {

            for (Integer each2: arr2
                 ) {

                if (each1 == each2 && !ortakElemanlarListesi.contains(each1)) {

                    ortakElemanlarListesi.add(each1);
                }
            }
        }

        Collections.sort(ortakElemanlarListesi);
        System.out.println(ortakElemanlarListesi); // [3, 5, 8, 1, 9, 2, 7]
    }
}
