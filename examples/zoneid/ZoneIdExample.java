package examples.zoneid;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdExample {

    public static void run() {
        Instant instant = Instant.now();
        ZoneId zoneId = ZoneId.of("Asia/Kolkata");
        ZonedDateTime zonedDateTime = instant.atZone(zoneId);

        System.out.println("ZoneId/ZonedDateTime");
        System.out.println(zoneId);
        System.out.println(zonedDateTime);
        System.out.println();
    }
}
