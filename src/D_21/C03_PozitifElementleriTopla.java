package D_21;

public class C03_PozitifElementleriTopla {

    public static void main(String[] args) {

        int[] arr= {-4,5,2,0,3}; // beklenen: 3 pozitif elementin toplami: 10

        System.out.println(pozitifElementleriTopla(arr)); // 3 pozitif elementin toplami: 10

    }

    public static String pozitifElementleriTopla(int[] arr) {

        int toplam = 0;
        int pozitif = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                toplam += arr[i];
                pozitif++;
            }
        }

        return (pozitif + " pozitif elementin toplami: " + toplam);
    }
}
