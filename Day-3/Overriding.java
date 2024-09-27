
class SuperClass{
    void display(){
        System.out.println("THis is the SuperClass Method");
    }
}

class DerivedClass extends SuperClass{
    void display(){
        System.out.println("This is DerivedClass Method..");
    }
}
public class Overriding {
    public static void main(String[] args) {
        DerivedClass derivedClass = new DerivedClass();
        derivedClass.display();
    }
}
