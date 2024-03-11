package D_02;

public class Ders_02_String {

    public static void main(String[] args) {

        int Num=20;

        String Name="Burak";

        System.out.println(Name.toUpperCase()); //BURAK

        System.out.println(Name.lines()); //java.util.stream.ReferencePipeline$Head@5594a1b5

        System.out.println(Name.isBlank()); //false

        String Surname="Yarar";

        System.out.println(Name+Surname); //BurakYarar

        String ad="Ahmet";
        String soyad="Yasar";

        System.out.println("Girilen "+ ad + " " + soyad + " " + "veri tabanina kaydedildi"); //Girilen Ahmet Yasar veri tabanina kaydedildi



    }

}
