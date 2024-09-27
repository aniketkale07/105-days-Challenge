class SuperClass{
    SuperClass(){
        System.out.println("\nThis is Super Class");
    }
}

class DerivedClass extends SuperClass{
    DerivedClass(){
        System.out.println("This is Derived Class");
    }
}
public class SingalInheritance {
    public static void main(String[] args) {
        DerivedClass derivedClass = new DerivedClass();
    }
}
