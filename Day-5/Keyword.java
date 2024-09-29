public class Keyword {
    public static void main(String[] args) {
        Cube cube = new Cube(4, 4, 2);
        cube.display();
    }
}

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("Area of rectangle: " + calculateArea());
    }

    private int calculateArea() {
        return length * breadth;
    }
}

class Cube extends Rectangle {
    private int width;

    public Cube(int length, int breadth, int width) {
        super(length, breadth);
        this.width = width;
    }

    public void display() {
        System.out.println("This is a cube");
        System.out.println("The area of the base square is: " + calculateBaseArea());
        System.out.println("The volume of the cube is: " + calculateVolume());
    }

    private int calculateBaseArea() {
        return width * width;
    }

    private int calculateVolume() {
        return width * width * width;
    }
}