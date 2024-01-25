// Create a class Circle with a method to initialize its radius, 
// calculating area, perimeter(circumference), etc.

public class Circle {
    double radius;
    public double calculateArea(){
        return 3.142 * radius * radius;
    }
    public double calculatePerimeter(){
        return 2 * 3.142 * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 24;
        System.out.println("Area of circle is " + c1.calculateArea());
        System.out.println("Perimeter or circumference of circle is " + c1.calculatePerimeter());
    }
}
