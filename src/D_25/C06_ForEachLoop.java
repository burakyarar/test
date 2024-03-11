package D_25;

public class C06_ForEachLoop {

    public static void main(String[] args) {

        int[] arr = {20,30,5,45};

        /*
            array'in tum elementlerini gozden gecirme gereken sorularda
            for loop kullaniriz

            en onemli ozelligi index sayesinde tim elementleri 0. index'den
            sonuncu index'e kadar sirali olarak getirmesidir

            sirali getirmenin onemli olmadigi durumlarda
            for-each loop kullanilir
         */

        for (int each: arr
             ) {
            System.out.print(each + " "); // 20 30 5 45
        }

    }
}
