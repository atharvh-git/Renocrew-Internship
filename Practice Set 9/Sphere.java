// Create a class Sphere and use getters and setters to set its radius.
// Calculate total surface area and volume of the sphere.

public class Sphere {
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    // method to calculate the area
    public double calcArea() {
        return 4 * 3.14 * radius * radius;
        // total surface area of a sphere
    }

    // method to calculate the Volume
    public double calcVolume() {
        return (1.33 * 3.14 * radius * radius * radius);
        // Volume of a sphere
    }

    public static void main(String[] args) {
        Sphere sp1 = new Sphere();
        sp1.setRadius(7);
        System.out.println("Radius of sphere is " + sp1.getRadius() + " units.");
        System.out.println("Total surface area of sphere is " + sp1.calcArea() + " unit².");
        System.out.println("Radius of sphere is " + sp1.calcVolume() + " unit³.");
    }
}
