// Create a class cylinder and use constructor to set its radius and height.

public class Cylinder3 {
    double radius;
    double height;

    public Cylinder3(double rad, double hei) {
        // This is a constructor of Cylinder3 Class, through
        // which values of radius and height are set
        radius = rad;
        height = hei;
    }

    public static void main(String[] args) {
        Cylinder3 obj = new Cylinder3(4, 5);
        System.out.println("Radius of cylinder is " + obj.radius);
        System.out.println("Height of cylinder is " + obj.height);
    }
}
