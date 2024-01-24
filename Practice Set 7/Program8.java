// Write a program using recursion to print the following  pattern.
// *
// * *
// * * *
// * * * *

public class Program8 {
    public static void main(String[] args) {
        int r = 4;
        printPattern(r, 1);
    }

    static void printPattern(int numR, int currentRow) {
        if (currentRow <= numR) {
            printStars(currentRow);
            System.out.println(); // Move to the next line
            printPattern(numR, currentRow + 1); // Recursive call with the next row
        }
    }

    static void printStars(int numStars) {
        if (numStars > 0) {
            System.out.print("* ");
            printStars(numStars - 1); // Recursive call with reduced number of stars
        }
    }
}
