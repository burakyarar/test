package D_18;

public class C03_StringTersCevirme {

    public static void main(String[] args) {

        System.out.println(metniTerseCevir("Bu is bu kadar"));
    }

    public static String metniTerseCevir(String metin) {

        String tersMetin = "";
        int index = metin.length()-1;

        while (index >= 0) {

            tersMetin += metin.charAt(index);
            index--;

        }

        return tersMetin;

    }
}

