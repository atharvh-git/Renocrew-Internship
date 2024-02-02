// Create a package in class with three package levels: folder, folder1, folder2

package folder.folderl1.folderl2;

class Calculator{
    public void calcSum(int a, int b){
        System.out.println("Sum is " + (a + b));
    }
}

class ScCalculator{
    public void calcDiff(int a, int b){
        System.out.println("Sum is " + (a - b));
    }
}

class HybridCalculator{
    public void calculate(int a, int b){
        System.out.println("Sine of (a + b) is " + Math.sin(a + b));
    }
}

public class Problem3 {
    public static void main(String[] args) {
        System.out.println("This is the main method!");
    }
}
