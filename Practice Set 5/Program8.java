// Write a program to calculate the sum of the numbers 
// occuring in the multiplication table of 8.

public class Program8 {
    public static void main(String[] args) {
        int n = 8; // number is given in problem
        int sum = 0;
        System.out.println("Table of " + n + " is => ");
        for(int i=1; i<=10; i++){
            int table_8 = n*i;
            System.out.println(table_8);
            sum = sum + table_8;
        }
        System.out.println("Sum of numbers occuring in table of 8 is " + sum);

    }
}
