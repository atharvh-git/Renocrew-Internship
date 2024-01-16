// Write a java program to encrypt a grade by adding 8 to it.
// Decrypt it to show the correct grade.

public class Program2 {
    public static void main(String[] args) {
        // Here, we encrypted the grade C
        char myGrade = 'C';
        myGrade = (char) (myGrade + 8);
        System.out.println(myGrade);

        // Similarly, decrypting the grade
        myGrade = (char) (myGrade - 8);
        System.out.println(myGrade);
    }
}
