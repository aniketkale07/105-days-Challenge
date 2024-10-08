// in Hybrid inheritance is combination of the two or more inheritance Type
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

class Wolf extends WildAnimal{
    Wolf(){
      
        System.out.println("This is Wolf Class Inheritanted from WildAnimal which is alredy inheritance from Animal ");
    }
}


public class HybridInheritance {
    public static void main(String[] args) {
        
        // Animal --> WildAnimal --> Wolf  ----> MultiLevel Inheritance
        // Animal --> WildAnimal --> PetAnimal -- > Hybrid Inheritance

        System.out.println("MultiLevel Inheritance");
       
      
        Wolf wolf = new Wolf();

        System.out.println("\nHybrid Inheritance");
       
        WildAnimal wildAnimal2 = new WildAnimal();
        PetAnimal petAnimal = new PetAnimal();
    }
}
