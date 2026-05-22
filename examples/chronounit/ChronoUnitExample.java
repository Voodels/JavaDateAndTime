package examples.chronounit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitExample {

    public static void run() {
        LocalDate fixedDate = LocalDate.of(2024, Month.JANUARY, 10);
        LocalTime fixedTime = LocalTime.of(14, 30, 0);
        LocalDateTime fixedDateTime = LocalDateTime.of(fixedDate, fixedTime);
        LocalDate nextDate = fixedDate.plusDays(1);
        LocalDateTime nextDateTime = fixedDateTime.plusHours(24);
        long daysBetween = ChronoUnit.DAYS.between(fixedDate, nextDate);
        long hoursBetween = ChronoUnit.HOURS.between(fixedDateTime, nextDateTime);

        System.out.println("ChronoUnit");
        System.out.println(daysBetween);
        System.out.println(hoursBetween);
        System.out.println();
    }
}
