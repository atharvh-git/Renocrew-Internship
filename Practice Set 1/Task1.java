// Write a java program to calculate percentage of a given student of CBSE 
// board exam. His marks from 5 subjects must be taken as input from the
// keyboard. Note, marks are out of 100.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);
        //taking input of marks scored in 5 subjects(out of 100)
        System.out.println("Marks in science: ");
        int science = marks.nextInt();
        System.out.println("Marks in mathematics: ");
        int mathematics = marks.nextInt();
        System.out.println("Marks in marathi: ");
        int marathi = marks.nextInt();
        System.out.println("Marks in hindi: ");
        int hindi = marks.nextInt();
        System.out.println("Marks in history: ");
        int history = marks.nextInt();
        //adding all the marks and storing its result in a variable 'sum'
        float sum = science + mathematics + marathi + hindi + history;
        // calculating percentage
        float percentage = (sum/500)*100;
        System.err.println("Percentage scored is " + percentage + " %");
    }
}
