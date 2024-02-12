// Write a java program to demonstrate syntax, logical and runtime errors.

public class ErrorsInJava {
    public static void main(String[] args) {
        // Example of Syntax Error: Missing semicolon at the end of the statement
        int num1 = 5
        System.out.println("Number 1: " + num1);

        // Example of Logical Error: Incorrect mathematical operation
        int num2 = 0;
        int result = num1 / num2; // Division by zero is a logical error
        System.out.println("Result: " + result);

        // Example of Runtime Error: ArrayIndexOutOfBoundsException
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Element at index 10: " + arr[10]);
    }
}
