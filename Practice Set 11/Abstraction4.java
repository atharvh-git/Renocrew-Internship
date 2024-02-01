// Create a class Telephone with ring(), lift(), and disconnect() methods as abstract methods.
// Create another class SmartPhone and demonstrate polymorphism there.

abstract class Telephone {
    abstract void ring();

    abstract void liftCall();

    abstract void disconnectCall();
}

class SmartPhone extends Telephone {
    public void ring() {
        System.out.println("Smartphone is ringing.");
    }

    public void liftCall() {
        System.out.println("Smartphone call is lifted.");
    }

    public void disconnectCall() {
        System.out.println("Call is disconnected!");
    }
}

// Demonstrating polymorphism
public class Abstraction4 {
    static void demoPolymorphism(Telephone phone) {
        phone.ring();
        phone.liftCall();
        phone.disconnectCall();
    }

    public static void main(String[] args) {
        Telephone smartphone = new SmartPhone(); // Using polymorphism
        demoPolymorphism(smartphone);
    }
}
