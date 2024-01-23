// Write a java program to find minimum element in an array.

public class Program7 {
    public static void main(String[] args) {
        int integers[] = {354, 123, 89, 56, 167}; //given array
        int min = integers[0]; 
        //considering element present at index 0 to be the minimum element of the given array
        //by comparing with that element, we can find the minimum element from the array
        for (int i = 0; i < integers.length; i++) {
            if(integers[i] < min){
                min = integers[i]; 
                //if found, we are storing the minimum element in the variable 'min'
            }
        }
        System.out.println("Minimum element of the given array is " + min);
    }
}
