package D_41;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("D_41/dosya.txt");

    }

    /*
        FileInputStream class'i bilgisayardaki dosyaya
        ulasmak icin kullanilir

        FileInputStream class'indan olusturdugumuz fis objesinin
        istedigimiz dosyayi bulabilmesi icin
        obje olustururken dosyanin yolunu parametre olarak vermeliyiz

        Java dosya okuma islemi istenildiginde
        dosyaya erisememe durumunda ne yapilmasi gerektigini bilmek ister

        Compile Time Exceptions (Checked Exceptions)
        1 - standart exceptions gibi try/catch blogu ile sarmalayabiliriz
            dolayisiyla exception olursa bile calismaya devam eder (handle)

        2 - eger exception olustugunda kodun calismaya devam etmesni
            istemiyorsak veya kodumuzdan emin oldugumuz icin bu riski
            onemsemiyorsak exception'i handle etmek yerine
            Java'ya SEN CALISMANA BAK biz riskin farkindayiz demek icin
            method declarasyonuna Throws keyword ile bekledigimiz exception'i yazabiliriz

     */
}
