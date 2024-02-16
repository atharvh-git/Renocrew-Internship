import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        //creating a HashSet of name set
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(5);
        set.add(56);
        set.add(12);
        set.add(89);
        set.add(34);
        //printing the HashSet
        System.out.println( "The given HashSet contains "+ set);
    }
}
