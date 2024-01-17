// Write a java program to detect double and triple spaces in a string.

public class Program4 {
    public static void main(String[] args) {
        String inputStr = "Hii,  my name is   Captain  Miller  !";
        // to detect double and triple spaces, we will use indexOf()
        // method, it will show at what index they are present in the string
        System.out.println("Double spaces " + inputStr.indexOf("  "));
        System.out.println("Triple spaces " + inputStr.indexOf("   "));
    }
}
