// Write a java program to sum first n even numbers using for loop.

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scan.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            // Calculate even number
            int evenNum = 2 * i;
            // Add evenNumber to sum
            sum = sum + evenNum;
        }

        System.out.println("Sum of first " + n + " even numbers is: " + sum);
    }
}
