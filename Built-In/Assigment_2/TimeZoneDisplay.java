import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneDisplay {
    public static void main(String[] args) {
        displayTimeInZone("GMT");
        displayTimeInZone("Asia/Kolkata"); // IST
        displayTimeInZone("America/Los_Angeles"); // PST
    }

    static void displayTimeInZone(String zone) {
        ZonedDateTime time = ZonedDateTime.now(ZoneId.of(zone));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss z, dd/MM/yyyy");
        System.out.println("Current time in " + zone + ": " + time.format(formatter));
    }
}
