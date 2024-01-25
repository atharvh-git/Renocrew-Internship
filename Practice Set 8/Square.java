// Create a class square with a method to initialize its side, calculating area, perimeter, etc.


public class Square {
    int s;
    public int calculateArea(){
        return s * s;
    }
    public int calculatePerimeter(){
        return 4 * s;
    }

    public static void main(String[] args) {
        Square sqr = new Square();
        sqr.s = 5;
        System.out.println("Area of square is " + sqr.calculateArea());
        System.out.println("Perimeter of square is " + sqr.calculatePerimeter());
    }
}
