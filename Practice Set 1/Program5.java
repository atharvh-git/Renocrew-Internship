// Write a java program to detect whether a number entered 
// by the user is integer or not.

import java.util.*;

public class Program5 {
    public static void main(String[] args)   
	{ 
        Scanner sce = new Scanner(System.in);
        System.out.println("Enter the number here: ");
		String number = sce.next();  //inputting a number from user         
		try{ 
			Integer.parseInt(number); 
            //this method parseInt() parses a string and returns an integer which is helpful for us to detect
            //whether the input number is an integer or not
			System.out.println(number + " is an integer"); 
		}  
		catch (NumberFormatException ex){ 
			System.out.println(number + " is not an integer"); 
		} 
	} 
}
