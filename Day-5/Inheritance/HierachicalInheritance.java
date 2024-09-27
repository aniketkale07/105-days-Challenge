// In Hierachical inheritance more than 1 derived class is are inheritated from signal super class

// Super class
class Animal {
    Animal(){
        System.out.println("All are Animal..");
    }    
}

class Dog extends Animal{
    Dog(){
        System.out.println("Dog is the Animal ...");
    }
}

class Cat extends Animal{
    Cat(){
        System.out.println("Cat is the Animal..");
    }
}

public class HierachicalInheritance {
    public static void main(String[] args) {
        System.out.println("\nCat Class is Calling ");
        Cat cat = new Cat();
        System.out.println("\nDog Class is Calling ");
        Dog dog = new Dog();
    }
}
