// Create a concrete class FountainPen using the class Pen with an addtional method changeNib().

abstract class Pen {
    abstract void Write();

    abstract void reFill();
}

class FountainPen extends Pen {
    // additional method to be implemented
    void changeNib() {
        System.out.println("Changing the Nib!");
    }

    void Write() {
        System.out.println("Writing using the FountainPen!");
    }

    void reFill() {
        System.out.println("Refilling the FountainPen!");
    }
}

public class Abstraction2 {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.changeNib();
        pen.Write();
        pen.reFill();
    }
}
