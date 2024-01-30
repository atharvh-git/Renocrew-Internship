// Create a class Rectangle and use inheritance to create another class cuboid. 
// Create methods for area and volume, also create getters and setters.

class Rectangle {
    double length;
    double breadth;

    public void setLength(double len) {
        length = len;
    }

    public double getLength() {
        return length;
    }

    public void setBreadth(double bre) {
        breadth = bre;
    }

    public double getBreadth() {
        return breadth;
    }

    // method to calculate area of rectangle
    public double calcArea() {
        return length * breadth;
    }
}

class Cuboid extends Rectangle {
    double height;

    public void setLength(double len) {
        length = len;
    }

    public double getLength() {
        return length;
    }

    public void setBreadth(double bre) {
        breadth = bre;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    // method to calculate volume of cuboid
    public double calcVolume() {
        return length * breadth * height;
    }
}

class Problem4 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setBreadth(3);
        r1.setLength(5);
        System.out.println("Area of rectangle: " + r1.calcArea());

        Cuboid c1 = new Cuboid();
        c1.setLength(7);
        c1.setBreadth(3);
        c1.setHeight(6);
        System.out.println("Volume of cuboid is " + c1.calcVolume());
    }
}
