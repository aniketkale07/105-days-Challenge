class Animal{
    Animal(){
        System.out.println("All are Animal...");
    }
    }
    class WildAnimal extends Animal{
        WildAnimal(){
            System.out.println("All are Wild Animal ");
        }
    }
    
    class PetAnimal extends Animal{
        PetAnimal(){
            System.out.println("The Pet Animal  .. ");
        }
    }

public class MultiLevelInheritance {
    public static void main(String[] args) {
        System.out.println("MultiLevel Inheritance ---> ");
        Wolf wolf = new Wolf();
    }
}
