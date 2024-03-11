package D_38;

public class E_Doktor extends D_Personel{
    @Override
    public void standartMaas() {
        System.out.println("Doktorlar icin standart maas 30.000 TL");
    }

    @Override
    public void mesai() {
        System.out.println("Doktorlar haftada 5 gun, gunluk 6 saat mesai yapar");
    }

    @Override
    public void yillikIzin() {
        System.out.println("Doktorlarin yillik 1 ay izni olur");
    }


}
