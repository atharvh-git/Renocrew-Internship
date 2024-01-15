// Write a program to calculate CGPA using marks of three subjects(out of 100).

import java.util.*;

class Program2 {
 
    static double calculateCGPA(double[] marks, int n){
        double pointer[] = new double[n];
        double sum = 0, cgpa;
        for (int i = 0; i < n; i++) {
            pointer[i] = (marks[i] / 10);
        }
        // Computing the sum of grades
        for (int i = 0; i < n; i++) {
            sum += pointer[i];
        }
        // Computing the CGPA
        cgpa = sum / n;
        return cgpa;
    }
    public static void main(String args[]){
        int n = 3;
        double[] marks = {92, 87, 74}; //array of marks of three subjects
        double cgpa = calculateCGPA(marks, n);
        System.out.println("CGPA = " + cgpa); //printing the CGPA
    }
}
