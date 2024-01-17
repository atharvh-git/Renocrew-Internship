// Write a program to format the following letter using escape sequence characters.
// letter = "Dear Harry, This Java Course is nice. Thanks!"
public class Program5 {
    public static void main(String[] args) {
        String letter = "Dear Harry, This Java Course is nice. Thanks!";
        //we will be using escape sequence characters such as \t, \n in this problem
        letter = "Dear Harry,\n\t This Java Course is nice.\nThanks!";
        System.err.println(letter); //printing the result
    }
}
