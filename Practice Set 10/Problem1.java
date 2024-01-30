// Create a class Circle and use inheritance to create another class Cylinder from it.

class Circle {
    double radius;

    public Circle(double rad) {
        radius = rad;
    }

    public double getRadius() {
        return radius;
    }
}

class Cylinder extends Circle {
    double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}

public class Problem1 {
    public static void main(String[] args) {

        Circle circle = new Circle(6.0);
        System.out.println("Radius of circle is : " + circle.getRadius());

        Cylinder cylinder = new Cylinder(6.0, 3.9);
        System.out
                .println("Radius and Height of Cylinder are : " + cylinder.getRadius() + " & " + cylinder.getHeight());
    }
}
