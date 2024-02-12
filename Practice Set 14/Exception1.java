// Write a java program that prints "HaHa" during Arithmetic exception and 
// "HeHe" during an Illegal argument exception.

public class Exception1 {
    public static void main(String[] args) {
        try {
            // ArithmeticException occurs while dividing by zero
            int answer = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("HaHa");
        }

        try {
            // IllegalArgumentException occurs while passing an illegal argument to a method
            myArgument(-9);
        } catch (IllegalArgumentException e) {
            System.out.println("HeHe");
        }
    }

    static void myArgument(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Argument must be non-negative");
        }
    }
}
