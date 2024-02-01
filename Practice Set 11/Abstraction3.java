// Create a class Monkey with jump() and bite() methods. Create a class Human which inherits 
// this Monkey class and implements BasicAnimal interface with eat() and sleep() methods.

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

public class Abstraction3 {
    public static void main(String[] args) {
        Human man = new Human(); // Object 1
        man.eat();
        man.canSpeak();

        Human woman = new Human(); // Object 2
        woman.jump();
        woman.bite();
    }
}
