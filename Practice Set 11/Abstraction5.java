// Create a class Monkey with jump() and bite() methods. Create a class Human which inherits 
// this Monkey class and implements BasicAnimal interface with eat() and sleep() methods.
// Demonstrate polymorphism using class Monkey in this example.

interface BasicAnimal {
    void eat();

    void sleep();
}

class Monkey {
    void jump() {
        System.out.println("Jumping!");
    }

    void bite() {
        System.out.println("Biting!");
    }
}

class Human extends Monkey implements BasicAnimal {
    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }

    void canSpeak() {
        System.out.println("Hey there!");
    }
}

public class Abstraction5 {
    public static void main(String[] args) {
        // Demonstrating polymorphism
        Monkey monkey = new Human();
        // monkey.canSpeak(); --> Can't use canSpeak() method because the reference is the class Monkey which do not have canSpeak() method. 
        monkey.jump();
        monkey.bite();

        BasicAnimal animal = new Human();
        animal.sleep();
        animal.eat();
    }
}