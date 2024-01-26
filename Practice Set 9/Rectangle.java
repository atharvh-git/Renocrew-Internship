// Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters.

public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        length = 4;
        breadth = 5;
    }

    // Overloaded constructor with custom parameters
    public Rectangle(int customLen, int customBre) {
        length = customLen;
        breadth = customBre;
    }

    // Getter methods for length and breadth
    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public static void main(String[] args) {
        // Creating a rectangle with default values
        Rectangle ob1 = new Rectangle();
        System.out.println(
                "Original Length and Breadth: " + ob1.getLength() + " units, Breadth: " + ob1.getBreadth() + " units");

        // Creating a rectangle with custom parameters
        Rectangle custom = new Rectangle(7, 8);
        System.out.println("Custom Length and Breadth: " + custom.getLength() + " units, Breadth: "
                + custom.getBreadth() + " units");
    }
}
