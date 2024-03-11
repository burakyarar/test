package D_26;

public class C01_EnBuyukElementiBulma {

    public static void main(String[] args) {

        int[] arr = {5,8542,3,8,2,83,86,9321,78,2,51,3};

        int enBuyukElement = arr[0];

        for (int each: arr
             ) {
            if (enBuyukElement < each) {
                enBuyukElement = each;
            }
        }

        System.out.println(enBuyukElement); // 9321

    }
}
