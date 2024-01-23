// Calculate the average marks from an array containing marks
// of all students in Physics using a for-each loop.

public class Program3 {
    public static void main(String[] args) {
        int marks[] = {50, 45, 67, 79, 91}; 
        // the above array contains marks of 5 students (out of 100) in the subject of Physics
        int sum = 0;
        for (int mar : marks) {
            sum = sum + mar;
        }
        // since there are 5 students, hence dividing sum by 5, we get
        System.out.println(sum/marks.length);

    }
}
