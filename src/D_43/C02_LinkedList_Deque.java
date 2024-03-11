package D_43;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList_Deque {

    public static void main(String[] args) {

        /*
            Deque: double ended que ==> Cift basli kuyruk
         */

        Deque<String> isimler = new LinkedList<>();

        isimler.add("Cemil"); // belirtilmemisse sona ekler
        isimler.addFirst("Resul");
        isimler.addLast("Mehmet");
        isimler.addLast("Resul");
        isimler.add("Eyyup");
        isimler.add("Kaan");

        // [Resul, Cemil, Mehmet, Resul, Eyyup, Kaan]

        System.out.println(isimler.removeLast()); // Kaan
        // [Resul, Cemil, Mehmet, Resul, Eyyup]

        System.out.println(isimler.removeLastOccurrence("Resul")); // true
        // [Resul, Cemil, Mehmet, Eyyup]

        System.out.println(isimler.removeLastOccurrence("Hilal")); // false
        // [Resul, Cemil, Mehmet, Eyyup]

        System.out.println(isimler.pollFirst()); // Resul
        // [Cemil, Mehmet, Eyyup] (ilk element yoksa null dondurur)

        System.out.println(isimler.pop()); // Cemil
        // [Mehmet, Eyyup] (ilk element yoksa NoSuchElementException firlatir)

        System.out.println(isimler.offerFirst("Bugra")); // true
        // [Bugra, Mehmet, Eyyup] (Kapasite sinirlamasi yoksa, icerde yer varsa ekler)

        System.out.println(isimler.peekFirst()); // Bugra
        // [Bugra, Mehmet, Eyyup] (ilk element yoksa null dondurur)

        System.out.println(isimler.element()); // Bugra
        // [Bugra, Mehmet, Eyyup] (ilk element yoksa NoSuchElementException firlatir)

        System.out.println(isimler.hashCode()); // 275678710

        isimler.clear();

        System.out.println(isimler.hashCode()); // 1

        isimler.add("Kahraman");

        System.out.println(isimler.hashCode()); // 841010808

        System.out.println(isimler);





    }
}
