import examples.chronounit.ChronoUnitExample;
import examples.formatting.FormattingExample;
import examples.now.NowExample;
import examples.ofmethods.OfMethodsExample;
import examples.periodduration.PeriodDurationExample;
import examples.zoneid.ZoneIdExample;
import examples.zoneoffset.ZoneOffsetExample;

public class Main {

    public static void main(String[] args) {
        NowExample.run();
        OfMethodsExample.run();
        ZoneIdExample.run();
        ZoneOffsetExample.run();
        PeriodDurationExample.run();
        ChronoUnitExample.run();
        FormattingExample.run();
    }
}