package D_46;

import java.util.Map;
import java.util.TreeMap;

public class C01_Compute {

    public static void main(String[] args) {

        String[] arr = {"a","b","s","a","c","d","b","c","a","a","s","z","k"};

        Map<String,Integer> harfMapi = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {

            harfMapi.computeIfPresent(arr[i],(k,v) -> v+1);
            harfMapi.computeIfAbsent(arr[i],v->1);
        }

        System.out.println(harfMapi); // {a=4, b=2, c=2, d=1, k=1, s=2, z=1}
    }
}
