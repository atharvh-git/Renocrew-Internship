// Use the date class in Java to print time in this format: 21:47:02 

import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        Date myDate = new Date(); //created an instance of Date class
        int hr = myDate.getHours();
        int min = myDate.getMinutes();
        int sec = myDate.getSeconds();
        //printing the time in required format => 21:47:02
        System.out.println(hr + ":" + min + ":" + sec);
    }
}
