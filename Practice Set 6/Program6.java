// Write a java program to find maximum element in an array.

public class Program6 {
    public static void main(String[] args) {
        int integers[] = {34, 123, 89, 56, 167}; //given arrray
        int max = integers[0]; 
        //considering element present at index 0 to be the greatest element of the given array
        //by comparing with that element, we can find the maximum element from the array
        for (int i = 0; i < integers.length; i++) {
            if(integers[i] > max){
                max = integers[i]; 
                //if found, we are storing the maximum element in the variable 'max'
            }
        }
        System.out.println("Maximum element of the given array is " + max);
    }
}
