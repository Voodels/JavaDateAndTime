package examples.zoneoffset;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class ZoneOffsetExample {

    public static void run() {
        Instant instant = Instant.now();
        ZoneOffset offset = ZoneOffset.ofHoursMinutes(1, 10);
        OffsetDateTime offsetDateTime = OffsetDateTime.ofInstant(instant, offset);

        System.out.println("ZoneOffset/OffsetDateTime");
        System.out.println(offset);
        System.out.println(offsetDateTime);
        System.out.println();
    }
}
