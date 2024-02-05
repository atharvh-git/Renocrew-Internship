// Write a program to print "Good Morning" and "Welcome" continuously on the screen in java using threads.
// Add a sleep method in welcome thread of above problem to delay its execution for 200 ms.

class GreetingThread extends Thread {
    String greeting;
    int delay;

    public GreetingThread(String myGreeting, int Time_delay) {
        greeting = myGreeting;
        delay = Time_delay;
    }
    @Override
    public void run() {
        while (true) {
            System.out.println(greeting);
            try {
                // Introducing a delay based on the provided value
                Thread.sleep(delay);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
}

public class DelayedGreeting {
    public static void main(String[] args) {
        // Creating two threads for "Good Morning" and "Welcome" with different delays
        GreetingThread goodMorningThread = new GreetingThread("Good Morning", 1000); // 1000 ms delay
        GreetingThread welcomeThread = new GreetingThread("Welcome", 200); // 200 ms delay

        // Starting the threads
        goodMorningThread.start();
        welcomeThread.start();
    }
}
