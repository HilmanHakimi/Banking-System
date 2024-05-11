package Day4;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeComparison {
    public static void main(String[] args) {
        //using java calendar
        Calendar calendar = new GregorianCalendar(2024, Calendar.APRIL, 25);
        {
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH)+1;
            int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
            System.out.println("Using Calendar: ");
            System.out.println("Date: " + year + "-" + month + "-" + dayOfMonth);
        }

        //usingjava time localdate
        LocalDate date = LocalDate.of(2024, 4,25);
        LocalDate nextday = date.plusDays(1);
        System.out.println("using local date");
        System.out.println("Date: " + nextday);

        //using local date time
        LocalDateTime dateTime = LocalDateTime.of(2024, Month.APRIL, 25, 12,0);
        LocalDateTime nextHour = dateTime.plusHours(1);
        System.out.println("Using Local Date Time");
        System.out.println("Date and Time " + nextday);



    }
}
