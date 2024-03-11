package D_30;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();

        System.out.println(time); // 15:42:35.128014700

        System.out.println(time.getHour()); // 15

        System.out.println(time.getMinute()); // 44

        System.out.println(time.minusMinutes(1000)); // 23:04:48.465566300

        System.out.println(time.minusHours(100)); // 11:45:23.396680900

        System.out.println(time.plusSeconds(10000)); // 18:32:25.176586900

        System.out.println(time.withHour(21)); // 21:46:09.077042300

        System.out.println(time.withSecond(0).withNano(0)); // 15:46

        LocalTime time1 = LocalTime.of(12,35);
        LocalTime time2 = LocalTime.of(14,34);

        System.out.println(time1.isBefore(time2)); // true
        System.out.println(time1.isAfter(time2)); // false

        LocalTime time3 = LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println("Londra saati: " + time3); // Londra saati: 20:51:34.904561300

    }
}
