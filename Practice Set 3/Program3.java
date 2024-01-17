// Write a java program to fill in a letter template which looks like below
// letter = "Dear <|name|>, Thanks a lot!"
// Here, we have to replace <|name|> with a string (some name).

public class Program3 {
    public static void main(String[] args) {
        String letter = "Dear <|name|>, Thanks a lot!";
        System.out.println( "String without updation => " + letter);
        // we are gonna use replace() method for replacement 
        // of <|name|> with some other name like Shardul 
        letter = letter.replace("<|name|>", "Shardul");
        // printing the updated string
        System.out.println( "String with updation => " + letter);
    }
}
