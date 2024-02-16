// Create an ArrayList and store names of 10 students inside it and print them using a for-each loop.

import java.util.*;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        // adding 10 students to the list
        myList.add("Rohini");
        myList.add("Dhriti");
        myList.add("Reema");
        myList.add("Ganesh");
        myList.add("Pariniti");
        myList.add("Heramb");
        myList.add("Atharv");
        myList.add("Aishwarya");
        myList.add("Vaibhav");
        myList.add("Deepak");
        // printing this list using a for-each loop
        for (String names : myList) {
            System.out.println(names);
        }

    }
}
