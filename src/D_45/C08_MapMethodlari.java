package D_45;

import java.util.HashMap;
import java.util.Map;

public class C08_MapMethodlari {

    public static void main(String[] args) {

        Map<String , Integer> harfler = new HashMap<>();

        harfler.put("K",25);
        harfler.put("L",10);
        harfler.put("T",5);
        harfler.put("Z",50);
        harfler.put("A",15);

        System.out.println(harfler); // {A=15, T=5, Z=50, K=25, L=10}

        System.out.println(harfler.putIfAbsent("L", 30)); // 10 (value var ve degerini getirdi)

        System.out.println(harfler); // {A=15, T=5, Z=50, K=25, L=10}

        int value = harfler.get("T");

        harfler.put("T",2*value);

        System.out.println(harfler); // {A=15, T=10, Z=50, K=25, L=10}

        System.out.println(harfler.compute("Z", (k, v) -> v + 20)); // 70

        System.out.println(harfler); // {A=15, T=10, Z=70, K=25, L=10}

        System.out.println(harfler.compute("L", (k, v) -> v * 3 + 5)); // 35

        System.out.println(harfler); // {A=15, T=10, Z=70, K=25, L=35}

        // System.out.println(harfler.putIfAbsent("M", 50));

        harfler.computeIfAbsent("M",v -> 50);

        System.out.println(harfler);

        harfler.computeIfPresent("T",(k,v) -> v+1);

        System.out.println(harfler);

    }
}
