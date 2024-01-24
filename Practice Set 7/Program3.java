// Write a recursive function to calculate sum of first n natural numbers.

import java.util.*;

public class Program3 {

    static int recursiveSum(int n) {
        if (n == 1) {
            return 1; 
            // sum of first natural number is 1
        } else {
            return n + recursiveSum(n - 1); 
            // Recursive case: sum of first n numbers = n + sum of first n-1 numbers
        }
    }
    public static void main(String[] args) {
        Scanner myscr = new Scanner(System.in);
        int n = myscr.nextInt();
        int sum = recursiveSum(n);
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }
}
