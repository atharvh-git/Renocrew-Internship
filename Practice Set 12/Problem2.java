// Use a built-in package in Java to write a class which displays a message (using sout) after taking input from the user.

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner scr = new Scanner(System.in);

        // Prompting the user to enter a message
        System.out.print("Enter a message: ");

        // Reading the user's input
        String userInput = scr.nextLine();

        // Displaying the entered message
        System.out.println("You entered: " + userInput);

        // Closing the scanner to to prevent memory leaks
        scr.close();
    }
}
