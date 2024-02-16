// Use the java.time API in Java to print time in this format: 21:47:02 

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class javaAPI {
    public static void main(String[] args) {
        // Get the current time
        LocalTime currTime = LocalTime.now();

        // Define the desired format
        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Format and print the time
        String formattedTime = currTime.format(df);
        System.out.println("The fomatted time is " + formattedTime);
    }
}
