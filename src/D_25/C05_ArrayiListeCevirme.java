package D_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ArrayiListeCevirme {

    public static void main(String[] args) {

        Integer[] arr = {1, 3, 4, 6, 7, 1, 3, 8, 5, 2, 3, 4, 9, 0, 1, 2, 5, 4, 3, 2};

        List<Integer> forList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            forList.add(arr[i]);
        }

        System.out.println(forList);
        // [1, 3, 4, 6, 7, 1, 3, 8, 5, 2, 3, 4, 9, 0, 1, 2, 5, 4, 3, 2]

        List<Integer> hazirMethodList = Arrays.asList(arr);
        System.out.println(hazirMethodList);
        // [1, 3, 4, 6, 7, 1, 3, 8, 5, 2, 3, 4, 9, 0, 1, 2, 5, 4, 3, 2]

        forList.remove(3);
        System.out.println(forList);
        // [1, 3, 4, 7, 1, 3, 8, 5, 2, 3, 4, 9, 0, 1, 2, 5, 4, 3, 2]

        // hazirMethodList.remove(3);
        // System.out.println(hazirMethodList); // UnsupportedOperationException

        forList.set(0,10);
        System.out.println(forList);
        // [10, 3, 4, 7, 1, 3, 8, 5, 2, 3, 4, 9, 0, 1, 2, 5, 4, 3, 2]
        System.out.println(Arrays.toString(arr));
        // [1, 3, 4, 6, 7, 1, 3, 8, 5, 2, 3, 4, 9, 0, 1, 2, 5, 4, 3, 2]

        hazirMethodList.set(0,20);
        System.out.println(hazirMethodList);
        // [20, 3, 4, 6, 7, 1, 3, 8, 5, 2, 3, 4, 9, 0, 1, 2, 5, 4, 3, 2]
        System.out.println(Arrays.toString(arr));
        // [20, 3, 4, 6, 7, 1, 3, 8, 5, 2, 3, 4, 9, 0, 1, 2, 5, 4, 3, 2]





    }
}