// Write a java program to print the following pattern using while loop.
// * * * *
// * * *
// * * 
// *

public class Program7 {
    public static void main(String[] args) {
        int rows = 4; 
        int i = 0;
        while (i < rows) {
            // Inner loop for printing '*' in each row
            int j = 0;
            while (j < (rows - i)) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
