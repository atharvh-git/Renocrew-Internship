// Calculate income tax paid by an employee to the 
// government as per the sections mentioned below:
// Income section        Tax
// 2.5 L - 5.0 L         05%
// 5.0 L - 10.0 L        20%
// Above 10.0 L          30%
// Note: There is no tax below 2.5L. Take income 
// amount as an input from the user.

import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter the annual income: ");
        double income = scr.nextDouble();

        double tax = IncomeTax(income);

        System.out.println("Income Tax: " + tax);
    }

    static double IncomeTax(double income) {
        if (income <= 250000) {
            return 0; // No tax for income up to 2.5 L
        } else if (income <= 500000) {
            return 0.05 * (income - 250000); // 5% tax on income between 2.5 L and 5 L
        } else if (income <= 1000000) {
            return 0.05 * (500000 - 250000) + 0.20 * (income - 500000); // 5% on first 2.5 L and 20% on income between 5 L and 10 L
        } else {
            return 0.05 * (500000 - 250000) + 0.20 * (1000000 - 500000) + 0.30 * (income - 1000000); // 5% on first 2.5 L, 20% on next 5 L, and 30% on income above 10 L
        }
    }
}
