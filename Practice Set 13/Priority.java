// Demonstrate getPriority() and setPriority() methods in java threads using a proper example.

class ThreadPriority1 extends Thread {

    public void run(){
        while (true) {
            System.out.println("Hii!");
            try {
                // Introducing a delay based on the provided value
                Thread.sleep(1000);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
}

class ThreadPriority2 extends Thread {

    public void run(){
        while (true) {
            System.out.println("Hello!");
            try {
                // Introducing a delay based on the provided value
                Thread.sleep(500);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
}
    
public class Priority{
    public static void main(String[] args) {
        ThreadPriority1 t1 = new ThreadPriority1();
        ThreadPriority2 t2 = new ThreadPriority2();
        // setting their priorities using setPriority() method
        t1.setPriority(4);
        t2.setPriority(7);
        //printing their set priorities using getPriority() method
        System.out.println("Priority for thread1 is " + t1.getPriority());
        System.out.println("Priority for thread2 is " + t2.getPriority());

    }
}
    
