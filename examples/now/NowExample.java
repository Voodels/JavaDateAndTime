package examples.now;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NowExample {

    public static void run() {
        Instant instant = Instant.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        System.out.println("now()");
        System.out.println(instant);
        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println();
    }
}
