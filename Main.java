import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        System.out.println("now()");
        System.out.println(instant);
        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(localTime);

        LocalDate fixedDate = LocalDate.of(2024, Month.JANUARY, 10);
        LocalTime fixedTime = LocalTime.of(14, 30, 0);
        LocalDateTime fixedDateTime = LocalDateTime.of(fixedDate, fixedTime);
        DayOfWeek dayOfWeek = fixedDate.getDayOfWeek();

        System.out.println("\nof()");
        System.out.println(fixedDate);
        System.out.println(fixedTime);
        System.out.println(fixedDateTime);
        System.out.println(dayOfWeek);

        ZoneId zoneId = ZoneId.of("Asia/Kolkata");
        ZonedDateTime zonedDateTime = instant.atZone(zoneId);

        System.out.println("\nZoneId/ZonedDateTime");
        System.out.println(zoneId);
        System.out.println(zonedDateTime);

        ZoneOffset offset = ZoneOffset.ofHoursMinutes(1, 10);
        OffsetDateTime offsetDateTime = OffsetDateTime.ofInstant(instant, offset);

        System.out.println("\nZoneOffset/OffsetDateTime");
        System.out.println(offset);
        System.out.println(offsetDateTime);

        Period period = Period.ofDays(1);
        LocalDate nextDate = fixedDate.plus(period);
        Duration duration = Duration.ofHours(24);
        LocalDateTime nextDateTime = fixedDateTime.plus(duration);

        System.out.println("\nPeriod vs Duration");
        System.out.println(nextDate);
        System.out.println(nextDateTime);

        long daysBetween = ChronoUnit.DAYS.between(fixedDate, nextDate);
        long hoursBetween = ChronoUnit.HOURS.between(fixedDateTime, nextDateTime);

        System.out.println("\nChronoUnit");
        System.out.println(daysBetween);
        System.out.println(hoursBetween);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formatted = localDateTime.format(formatter);
        LocalDate parsedDate = LocalDate.parse("2024-01-10");

        System.out.println("\nFormatting");
        System.out.println(formatted);
        System.out.println(parsedDate);
    }
}