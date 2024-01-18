// Write a java program to find out the day of the week given the 
// number i.e. 1 for Monday, 2 for Tuesday.... and so on.

import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        Scanner scf = new Scanner(System.in);
        System.out.print("Enter the day number here: ");
        //taking input of day number
        int day_num = scf.nextInt();
        if(day_num == 1) System.out.println("Monday");
        else if(day_num == 2) System.out.println("Tuesday");
        else if(day_num == 3) System.out.println("Wednesday");
        else if(day_num == 4) System.out.println("Thursday");
        else if(day_num == 5) System.out.println("Friday");
        else if(day_num == 6) System.out.println("Saturday");
        else if(day_num == 7) System.out.println("Sunday");
        else System.out.println("Invalid day number!\nValid day numbers are 1 to 7 only!");
    }
}
