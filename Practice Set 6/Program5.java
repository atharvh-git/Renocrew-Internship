// Write a java program to reverse an array.

public class Program5 {
    public static void main(String[] args) {
        int arr[] = {34, 45, 23, 56, 12}; //given array of integers
        //to reverse the array, we are traversing the array from the rear element
        for (int i = arr.length - 1; i >=0; i--) {
            System.out.print(arr[i] + ", ");
        }
    }
}
