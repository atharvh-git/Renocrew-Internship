//Write a java program to find factorial of a given number using for loop.

public class Program5 {
    public static void main(String[] args) {
        int num = 5, fact = 1;
        for(int i = num; i >= 1; i--){
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
    }
}
