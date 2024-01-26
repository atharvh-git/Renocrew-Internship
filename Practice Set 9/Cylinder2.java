// Create a class cylinder and use getters and setters to set its radius and height.
// Calculate surface area and volume of the cylinder.

public class Cylinder2 {
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

    // method to calculate the Surface Area
    public double calcArea() {
        return (2 * 3.14 * radius * height + 2 * 3.14 * radius * radius);
        // Surface area of a cylinder
    }

    // method to calculate the Volume
    public double calcVolume() {
        return (3.14 * radius * radius * height);
        // Volume of a cylinder
    }

    public static void main(String[] args) {
        Cylinder2 cyl = new Cylinder2();
        cyl.setRadius(5);
        cyl.setHeight(7);
        System.out.println("Radius of cylinder is " + cyl.getRadius() + " units.");
        System.out.println("Height of cylinder is " + cyl.getHeight() + " units.");
        System.out.println("Surface area of cylinder is " + cyl.calcArea() + " unit².");
        System.out.println("Volume of cylinder is " + cyl.calcVolume() + " unit³.");
    }
}
