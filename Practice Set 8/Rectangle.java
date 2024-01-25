// Create a class Rectangle with a method to initialize its side, calculating area, perimeter, etc.

public class Rectangle {
    int length, breadth;
    
    public int calculateArea(){
        return length * breadth;
    }
    public int calculatePerimeter(){
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.length = 12;
        rect.breadth = 10;
        System.out.println("Area of rectangle is " + rect.calculateArea() + " unit²");
        System.out.println("Perimeter of rectangle is " + rect.calculatePerimeter() + " units");
    }
}
