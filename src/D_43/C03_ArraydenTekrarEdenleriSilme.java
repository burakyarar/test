package D_43;

import java.util.*;

public class C03_ArraydenTekrarEdenleriSilme {

    public static void main(String[] args) {

        int[] arr = {2,4,5,6,3,4,2,1,5,6,4,3,2,3,0,1,3,4,2,5};

        // tekrar edenleri silip her elementten sadece 1 adet bulunan bir hale donustur

        List<Integer> tekrarsizList = new ArrayList<>();

        for (int each: arr
        ) {
            if (!tekrarsizList.contains(each)) {
                tekrarsizList.add(each);
            }

        }

        System.out.println(tekrarsizList); // [2, 4, 5, 6, 3, 1, 0]

        Set<Integer> tekrarsizSet = new TreeSet<>();

        for (int each: arr
             ) {
            tekrarsizSet.add(each);
        }

        System.out.println(tekrarsizSet); // [0, 1, 2, 3, 4, 5, 6]

        arr = new int[tekrarsizSet.size()];

        int index = 0;

        for (Integer each: tekrarsizSet
             ) {
            arr[index] = each;
            index++;
        }

        System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4, 5, 6]

    }
}
