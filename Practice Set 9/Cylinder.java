// Create a class cylinder and use getters and setters to set its radius and height.

public class Cylinder {
    double radius;
    double height;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        height = h;
    }

    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        cy1.setRadius(5);
        cy1.setHeight(8);
        System.out.println("Radius of cylinder is " + cy1.getRadius() + " units.");
        System.out.println("Height of cylinder is " + cy1.getHeight() + " units.");
    }
}
