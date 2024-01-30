// Create a class Circle and use inheritance to create another class Cylinder from it.
// Create methods for area and volume in both the classes.

class Circle {
    double radius;

    public Circle(double rad) {
        radius = rad;
    }

    public double getRadius() {
        return radius;
    }

    // method to calculate Area of the circle
    public double calcArea() {
        return Math.PI * radius * radius;
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

    // method to calculate Volume of the circle
    public double calcVolume() {
        return Math.PI * radius * radius * height;
    }
}

class Problem3 {
    public static void main(String[] args) {

        Circle circle = new Circle(6.0);
        System.out.println("Area of circle is: " + circle.calcArea());

        Cylinder cylinder = new Cylinder(5.0, 3.9);
        System.out.println("Volume of cylinder is: " + cylinder.calcVolume());
    }
}