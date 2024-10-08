/**
 * Polymorphism
 */
public class Polymorphism {

    public static void main(String[] args) {
        // Polymorphism with OverLoading
        Room room1 = new Room(31.3f, 44.3f);
        Room room2 = new Room(43.3f);

        System.out.println("Area of room1: " + room1.area());
        System.out.println("Area of room2: " + room2.area());

        // Polymorphism with Overriding
        SuperClass superClass = new SuperClass(10, 20);
        DerivedClass derivedClass = new DerivedClass(10, 20, 30);

        System.out.println("Area of superClass: " + superClass.area());
        System.out.println("Area of derivedClass: " + derivedClass.area());
    }
}

/**
 * PolymorphsimWithOverloading
 */
class Room {
    float length;
    float breadth;

    Room(float x, float y) {
        length = x;
        breadth = y;
    }

    Room(float x) {
        length = breadth = x;
    }

    float area() {
        return (length * breadth);
    }
}

/**
 * Polymorphism With Overriding */
class SuperClass{
    int length;
    int breadth;

    SuperClass(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    int area(){
        return (length * breadth);
    }
}

class DerivedClass extends SuperClass{

    int width;

    DerivedClass(int length, int breadth, int width){
        super(length, breadth);
        this.width = width;
    }

    @Override
    int area(){
        return (width * width);
    }
}