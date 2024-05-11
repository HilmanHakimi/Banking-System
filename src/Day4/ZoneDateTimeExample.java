package Day4;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeExample {
    public static void main(String[] args) {
        //CREATE a zondatetime for April 25 2024 at 12 pm in newyork time zone
        ZoneId zonId = ZoneId.of("America/New_York");// zone id is not variable
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2024, 4, 25, 0, 0,0,0,zonId);

        //output the date and time in newyork time zone
        System.out.println("Date and time in new york "+ zonedDateTime);
    }
}
