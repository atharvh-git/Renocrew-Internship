// Write a program to find whether a year entered 
// by the user isa leap year or not.

import java.util.*;

public class Program5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year here: ");
        int year = input.nextInt();
        if(year % 400 == 0){
            System.out.println(year + " is a leap year.");
        }else if(year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " is a leap year.");
        }else{
            System.out.println(year + " is not a leap year.");
        }
    }
}
