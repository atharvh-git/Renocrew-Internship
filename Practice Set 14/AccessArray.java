// Write a java program that allows you to keep accessing an array until a valid 
// index is given. If max retries exceed 5, print "Error".

import java.util.*;

public class AccessArray {
    public static void main(String[] args) {
        boolean flag = true;
        int myArr[] = { 3, 4, 5, 6 };
        Scanner scr = new Scanner(System.in);
        int index;
        int j = 0;
        while (flag && j < 5) {
            try {
                System.out.println("Enter the index value: ");
                index = scr.nextInt();
                System.out.println("The value at index " + index + " is " + myArr[index]);
                break;
            } catch (Exception edx) {
                System.out.println("Invalid Index...");
                j++;
            }
        }
        if (j >= 5)
            System.out.println("Error!");
    }
}
