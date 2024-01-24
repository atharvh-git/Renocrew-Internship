// Write a program to print a multiplication table of a number n.

import java.util.*;

public class Program1 {
    static void multiTable(int n) {
        int table = 1;
        System.out.println("Table of " + n + " is ");
        for (int i = 1; i <= 10; i++) {
            table = n * i;
            System.out.println(table);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        multiTable(num); // funtion called
    }
}
