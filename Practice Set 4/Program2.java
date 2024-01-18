// write a program to find out whether a student is pass or fail;
// if he/she requires total 40% and at least 33% in each subject to pass.
// Assume 3 subjects and take marks as an input from the user. 

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        //considering marks obtained are out of 100
        Scanner marks = new Scanner(System.in);
        System.out.println("Enter marks obtained in Marathi: ");
        int Marathi = marks.nextInt();
        System.out.println("Enter marks obtained in Science: ");
        int Science = marks.nextInt();
        System.out.println("Enter marks obtained in History: ");
        int History = marks.nextInt();
        
        float total = (Marathi + History + Science) / 3.0f;
        System.out.println("Your overall percentage is " + total);
        if(total >= 40 &&  Marathi>= 33 && Science >= 33 && History >= 33){
            System.out.println("Passed!");
        }else{
            System.out.println("Failed!");
        }
    }
}
