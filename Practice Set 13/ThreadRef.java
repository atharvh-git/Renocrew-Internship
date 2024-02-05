// How do you get reference to the current thread in java? Explain with an example.

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

public class ThreadRef {
    public static void main(String[] args) {
        MyRunnable m1 = new MyRunnable();
        Thread t1 = new Thread(m1).currentThread();
        System.out.println("Current thread: " + t1);
        System.out.println("Thread ID: " + t1.threadId());
        System.out.println("Thread Name: " + t1.getName());
        System.out.println("Thread Priority: " + t1.getPriority());
        System.out.println("Thread State: " + t1.getState());

    }
}
