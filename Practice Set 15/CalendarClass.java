// Use the Calendar class in Java to print time in this format: 21:47:02 

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarClass {
    public static void main(String[] args) {
        // Gettinh the current time using Calendar
        Calendar calendar = Calendar.getInstance();
        int hr = calendar.get(Calendar.HOUR_OF_DAY);
        int min = calendar.get(Calendar.MINUTE);
        int sec = calendar.get(Calendar.SECOND);

        // Formatting the time
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String formattedTime = sdf.format(calendar.getTime());

        // Printing the formatted time
        System.out.println(formattedTime);
    }
}
