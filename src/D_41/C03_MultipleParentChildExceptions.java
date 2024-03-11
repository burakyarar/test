package D_41;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_MultipleParentChildExceptions {

    public static void main(String[] args) {

        String dosyaYolu = "D_41/dosya.txt";

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);

            int k = 0;

            while ((k = fis.read() ) != (-1)) {
                System.out.println((char) k);
            }
        } catch (FileNotFoundException e) { // once child

            System.out.println("Verilen dosya bulunamadi, yol hatali");

        } catch (IOException e) { // sonra parent

            System.out.println("Dosya okunamiyor");

        }


    }
}
