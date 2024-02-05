// Write a program to print "Good Morning" and "Welcome" continuously on the screen in java using threads.

class Greeting extends Thread {
    String greeting;

    public Greeting(String myGreeting) {
        greeting = myGreeting;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(greeting);
            try {
                // Sleep for 1 second to slow down the output
                Thread.sleep(1000);
            } catch (Exception exp) {
                System.out.println(exp);
            }
        }
    }
}

public class ContinuousGreetings {
    public static void main(String[] args) {
        // Creating two threads for "Good Morning" and "Welcome"
        Greeting Wthread = new Greeting("Welcome");
        Greeting GMthread = new Greeting("Good Morning");

        // Starting the threads
        Wthread.start();
        GMthread.start();
    }
}
