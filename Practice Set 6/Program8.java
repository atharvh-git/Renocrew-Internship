// Write a program to check whether an array is sorted or not.

public class Program8 {
    static int SortedOrNot(int array[], int n)
    {
        if (array[n - 1] < array[n - 2]){
            return 0;
        }
        
        // Array has one or no element or the
        // rest are already checked and approved.
        if (n == 1 || n == 0){
            return 1;
        }

        return SortedOrNot(array, n - 1);
    }
    public static void main(String[] args) {
        int array[] = {12, 34, 67, 23, 45, 11, 5, 45}; //given array
        int n = array.length;
        if (SortedOrNot(array, n) != 0) System.out.println("Yes, array is sorted!");
        else System.out.println("No, array is not sorted!");
    }
}
