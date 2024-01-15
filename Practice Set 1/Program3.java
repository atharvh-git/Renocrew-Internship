// Write a Java Program which asks the user to enter his/her
// name and greets them with "Hello <name>, have a good day!" text.

import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String your_name = scr.nextLine(); 
        // here, we used nextLine() instead of next() because the user may put his/her
        // full name which includes a space too, hence to consider that space as well, 
        // usage of nextLine() will be suitable.
        System.out.println("Hello " + your_name + ", have a good day!"); //printing the greeting
    }
}
