package D_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_TekrarEdenSayilariSilme {

    public static void main(String[] args) {

        int[] arr = {2,4,5,3,2,5,1,5,3,7};

        // [2,4,5,3,1,7]

        // ArrayList arrayList = new ArrayList<>(int[] arrList);

        List<Integer> tekrarsizList = new ArrayList<>();

        System.out.println(tekrarsizList); // []

        for (int i = 0; i < arr.length; i++) {

            if (!tekrarsizList.contains(arr[i])) {

                tekrarsizList.add(arr[i]);
            }
        }

        System.out.println(tekrarsizList); // [2, 4, 5, 3, 1, 7]

        arr = new int[tekrarsizList.size()];

        // arr = tekrarsizList;

        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0, 0]

        for (int i = 0; i < tekrarsizList.toArray().length; i++) {

            arr[i] = tekrarsizList.get(i);
        }

        System.out.println(Arrays.toString(arr)); // [2, 4, 5, 3, 1, 7]

    }
}
