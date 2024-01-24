// Write a program using recursion to print the following  pattern.
// * * * *
// * * *
// * *
// *

public class Program7 {
    public static void main(String[] args) {
        int r = 4;
        printPattern(r);
    }

    static void printPattern(int numR) {
        if (numR > 0) {
            printStars(numR);
            System.out.println(); // Move to the next line
            printPattern(numR - 1); // Recursive call with reduced number of rows
        }
    }

    static void printStars(int numS) {
        if (numS > 0) {
            System.out.print("* ");
            printStars(numS - 1); // Recursive call with reduced number of stars
        }
    }
}
