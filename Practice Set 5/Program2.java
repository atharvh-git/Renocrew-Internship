// Write a java program to sum first n even numbers using while loop.

import java.util.*;

public class Program2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scr.nextInt();

        int sum = 0;
        int c = 1; 
        int number = 2; // starting from 2, the first even number

        while (c <= n) {
            sum += number;
            number += 2; // move to the next even number
            c++;
        }
        System.out.println("Sum of first " + n + " even numbers is: " + sum);
    } 
}
