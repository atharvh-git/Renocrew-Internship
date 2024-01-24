// Write a function to convert Celsius temperature into Farenheit.

import java.util.*;

public class Program9 {

    static void convertToFarenheit(double temp){
        double FH = (1.8 * temp) + 32;
        System.out.println("The temperature in FARENHEIT is " + FH);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the tempeature in CELSIUS: ");
        double Celsius = sc.nextDouble();
        convertToFarenheit(Celsius);
    }
}
