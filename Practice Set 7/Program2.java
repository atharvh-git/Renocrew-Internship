// Write a program using functions to print the following  pattern.
// *
// * *
// * * *
// * * * *

public class Program2 {
    
    static void printPattern(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            printStars(i);
            System.out.println(); // Move to the next line after each row
        }
    }

    static void printStars(int numStars) {
        for (int j = 1; j <= numStars; j++) {
            System.out.print("* "); // this line prints stars
        }
    }

    public static void main(String[] args) {
        int no_of_rows = 4;
        printPattern(no_of_rows);
    }
}
