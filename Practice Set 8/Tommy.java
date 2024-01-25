// Create a class Tommy Vercetti for Rockstar Games capable 
// of hitting(print hitting...), running, firing, etc.

public class Tommy {

    void TommyIsHitting(){
        // when this method is called from the main() function
        // it prints "Hitting..."
        System.out.println("Hitting...");
    }
    void TommyIsRunning(){
        System.out.println("Running...");
    }
    void TommyIsFiring(){
        System.out.println("Firing!");
    }
    void TommyIsDriving(){
        System.out.println("Driving a Ferrari...");
    }

    public static void main(String[] args) {
        Tommy vercetti = new Tommy();
        vercetti.TommyIsHitting();
        vercetti.TommyIsFiring();
        vercetti.TommyIsDriving();
        vercetti.TommyIsRunning();
    }
}
