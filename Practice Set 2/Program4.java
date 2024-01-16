// Write the following expression in a java program
// v²-u²/2as

import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        Scanner sce = new Scanner(System.in);
        System.out.println("Enter the value of v: ");
        double v = sce.nextDouble();
        System.out.println("Enter the value of u: ");
        double u = sce.nextDouble();
        System.out.println("Enter the value of a: ");
        double a = sce.nextDouble();
        System.out.println("Enter the value of s: ");
        double s = sce.nextDouble();
        // calculating the value of v²-u²/2as expression
        double result;
        result = (Math.pow(v, 2) - Math.pow(u, 2)) / (2 * a * s);
        // or you may write, result = (v*v - u*u) / (2*a*s);
        System.out.println("The value of expression v²-u²/2as is " + result); // printing the result
    }
}
