package examples.formatting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingExample {

    public static void run() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formatted = localDateTime.format(formatter);
        LocalDate parsedDate = LocalDate.parse("2024-01-10");

        System.out.println("Formatting");
        System.out.println(formatted);
        System.out.println(parsedDate);
        System.out.println();
    }
}
