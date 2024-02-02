// Prove that you cannot access default property but can access protected property from the subclass.

package main_pack;

public class Problem4 {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.accessProperties();
    }
}
