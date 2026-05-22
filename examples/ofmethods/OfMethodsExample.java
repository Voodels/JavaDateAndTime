package examples.ofmethods;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class OfMethodsExample {

    public static void run() {
        LocalDate fixedDate = LocalDate.of(2024, Month.JANUARY, 10);
        LocalTime fixedTime = LocalTime.of(14, 30, 0);
        LocalDateTime fixedDateTime = LocalDateTime.of(fixedDate, fixedTime);
        DayOfWeek dayOfWeek = fixedDate.getDayOfWeek();

        System.out.println("of()");
        System.out.println(fixedDate);
        System.out.println(fixedTime);
        System.out.println(fixedDateTime);
        System.out.println(dayOfWeek);
        System.out.println();
    }
}
