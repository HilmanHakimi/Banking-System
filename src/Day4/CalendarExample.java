package Day4;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {

        //create calendar instance
        Calendar calendar = Calendar.getInstance();

        //set the year month and day of the month
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.APRIL);
        calendar.set(Calendar.DAY_OF_MONTH, 25);

        //Get the year month and day of the month
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;//Month is zero-based so add 1
        int dayofMonth = calendar.get(Calendar.DAY_OF_MONTH);

        //Output the data
        System.out.println("The date is : " + dayofMonth+ "/"+month+"/"+year);
        System.out.println("The Day is: "+dayofMonth);
        System.out.println("The month is: "+month);
        System.out.println("The year is: "+year);
    }
}
