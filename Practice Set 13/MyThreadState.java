// How do you get state of a given thread in java? Explain with an example.

class MyRunnable implements Runnable {
    @Override
    public void run() {
        // Thread's task
        try {
            Thread.sleep(2000); // Simulating some work
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }
}

public class MyThreadState {
    public static void main(String[] args) {
        MyRunnable m1 = new MyRunnable();
        Thread t1 = new Thread(m1);
        // Initial state of t1 before starting
        System.out.println("Initial State: " + t1.getState());
        t1.start();
        // Current State of t1 after starting
        System.out.println("Current State: " + t1.getState());
    }
}
