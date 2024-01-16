// Use comparison operators to find out whether a given number 
// is greater than the user entered number or not.

import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scr.nextInt();
        int num = 12; // given number
        if (num > input) {
            System.out.println("Given number is greater than the input number.");
        } else {
            System.out.println("Given number is less than the input number.");
        }
    }
}
