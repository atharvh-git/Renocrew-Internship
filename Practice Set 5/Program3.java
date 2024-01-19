// Write ajava program to print the multiplication table of a given number n.

public class Program3 {
    public static void main(String[] args) {
        int n = 9; // given number
        // Else, we can take the number as an input from the user as follows:
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        System.out.println("Table of " + n + " is => ");
        for(int i=1; i<=10; i++){
            int table = n*i;
            System.out.println(table);
        }
    }
}
