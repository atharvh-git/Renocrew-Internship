// Write a program to find out whether a given integer is present in array or not.

import java.util.*;

public class Program2 {
    public static void main(String[] args) {
        int arr[] = {2, 5, 3, 6, 8}; // array of integers
        boolean found = false;
        System.out.println("Enter the number to be searched: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]){
                found = true;
            }
        }
        if(found) System.out.println("Number is present in the given array.");
        else System.out.println("Number is absent!");
    }
}
