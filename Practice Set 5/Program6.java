// Write a java program to find factorial of a given number using while loop.

import java.util.*;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number here: ");
        int num = sc.nextInt();
        int num2 = num;
        int fact = 1;
        while(num2 > 0){
            fact = fact * num2;
            num2--;
        }
        System.out.println("Factorial of " + num + " is " + fact);
    }
}
