// Write a java program to convert kilometres into miles.

import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //prompting the user to provide the input
        System.out.println("Enter the distance in Km: ");
        //taking input of distance in Km from user
        double dist_Km = sc.nextDouble(); 
        //converting the distance from Km to miles using their relationship
        // 1.60934 Km = 1 mi
        double dist_mi = (double) dist_Km/1.60934; 
        System.err.println(dist_mi + " mi"); //printing the result
    }
}
