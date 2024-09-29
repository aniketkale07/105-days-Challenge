abstract class SuperAbstractClass {

    public abstract void AnimalSound();

    // Regular Method
    public void show(){
        System.out.println("This is from abstract class --> SuperAbstractClass");
    }
}

class Pig extends SuperAbstractClass {

    @Override
    public void AnimalSound() {
        System.out.println("The Pig says --> WEE WEE");
        
    }

    
}
public class AbstractionWithCLass {
    
    public static void main(String[] args) {

        // ABstract with abstarct class
        System.out.println();
        Pig pig = new Pig();
        pig.AnimalSound();
        pig.show();

    }
}