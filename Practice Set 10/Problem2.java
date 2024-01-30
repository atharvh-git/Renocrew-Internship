// Create a class Rectangle and use inheritance to create another class cuboid. 
// Try to keep it as close to real world scenario.

class Rectangle {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }
}

class Cuboid extends Rectangle {
    double height;

    public Cuboid(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}

public class Problem2 {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5.0, 8.0);
        System.out.println(
                "Rectangle's length and breadth are: " + rectangle.getLength() + " and " + rectangle.getBreadth());

        Cuboid cuboid = new Cuboid(0, 0, 9.0);
        System.out.println("Cuboid's height is: " + cuboid.getHeight());
    }
}
