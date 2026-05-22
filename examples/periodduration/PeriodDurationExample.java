package examples.periodduration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class PeriodDurationExample {

    public static void run() {
        LocalDate fixedDate = LocalDate.of(2024, Month.JANUARY, 10);
        LocalTime fixedTime = LocalTime.of(14, 30, 0);
        LocalDateTime fixedDateTime = LocalDateTime.of(fixedDate, fixedTime);
        Period period = Period.ofDays(1);
        Duration duration = Duration.ofHours(24);
        LocalDate nextDate = fixedDate.plus(period);
        LocalDateTime nextDateTime = fixedDateTime.plus(duration);

        System.out.println("Period vs Duration");
        System.out.println(nextDate);
        System.out.println(nextDateTime);
        System.out.println();
    }
}
