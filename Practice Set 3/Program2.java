// Write a program to replace spaces present in a string with underscores.

public class Program2 {
    public static void main(String[] args) {
        String str = "Hello, my name is Miller!"; // given string
        String new_str = "";
        // here, we are using replace() method which is helpful in replacing
        // spaces with underscores in the given string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                new_str = str.replace(" ", "_");
            }
        }
        System.err.println("Updated String is: " + new_str);
    }
}
