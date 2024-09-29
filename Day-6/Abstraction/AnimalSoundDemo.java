interface Animal {
    void animalSound();
    void animalName();
}

class Cow implements Animal {

    @Override
    public void animalName() {
        System.out.println("Animal Name --> COW ");
    }

    @Override
    public void animalSound() {
        System.out.println("Cow says Hmmmmmm Hmmmmmmmmm");
    }
}

public class AnimalSoundDemo {
    public static void main(String[] args) {
        Cow cow = new Cow();
        System.out.println();
        cow.animalName();
        cow.animalSound();
    }
}