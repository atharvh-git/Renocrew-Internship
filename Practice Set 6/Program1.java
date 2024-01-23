// Write a program to create an array of 5 floats and calculate their sum.

public class Program1 {
    public static void main(String[] args) {
        float arr[] = { 1.2f, 3.45f, 4.3f, 5.4f, 6.2f };
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of the 5 floats is " + sum);
    }
}
