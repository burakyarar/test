package D_31;

import java.time.LocalDate;
import java.time.Period;

public class C04_Period {

    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(2000,10,12);
        LocalDate bugun = LocalDate.now();

        System.out.println(Period.between(dogumTarihi, bugun)); // P22Y10M1D

        System.out.println(Period.between(dogumTarihi, bugun).getYears());
    }
}
