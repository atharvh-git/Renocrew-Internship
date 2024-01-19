// Write a java program to print multiplication table of 10 in reverse order.

public class Program4 {
    public static void main(String[] args) {
        int n = 10; // number is given in problem
        System.out.println("Table of " + n + " in \'reversed order\' is => ");
        for(int i=10; i>=1; i--){
            int table_10 = n*i;
            System.out.println(table_10);
        }
    }
}
