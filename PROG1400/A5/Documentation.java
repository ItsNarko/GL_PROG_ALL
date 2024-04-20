// Task 1: Animal interface
interface Animal {
    /**
     * Method to make a sound specific to each animal.
     */
    void makeSound();
}

// Task 2: Pet interface
interface Pet {
    /**
     * Method to indicate friendliness of the pet.
     */
    void beFriendly();

    /**
     * Method to simulate playing behavior of the pet.
     */
    void play();
}

// Task 3: WildAnimal interface
interface WildAnimal extends Animal {
    /**
     * Method to simulate hunting behavior of the wild animal.
     */
    void hunt();
}

// Dog class implementing Animal and Pet interfaces
class Dog implements Animal, Pet {
    /**
     * Implementation of makeSound method for a dog.
     */
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    /**
     * Implementation of beFriendly method for a dog.
     */
    @Override
    public void beFriendly() {
        System.out.println("Dog is friendly");
    }

    /**
     * Implementation of play method for a dog.
     */
    @Override
    public void play() {
        System.out.println("Dog is playing fetch");
    }
}

// Cat class implementing Animal and Pet interfaces
class Cat implements Animal, Pet {
    /**
     * Implementation of makeSound method for a cat.
     */
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    /**
     * Implementation of beFriendly method for a cat.
     */
    @Override
    public void beFriendly() {
        System.out.println("Cat is friendly");
    }

    /**
     * Implementation of play method for a cat.
     */
    @Override
    public void play() {
        System.out.println("Cat is playing with a toy");
    }
}

// Lion class implementing WildAnimal interface
class Lion implements WildAnimal {
    /**
     * Implementation of makeSound method for a lion.
     */
    @Override
    public void makeSound() {
        System.out.println("Roar");
    }

    /**
     * Implementation of hunt method for a lion.
     */
    @Override
    public void hunt() {
        System.out.println("Lion is hunting for prey");
    }
}

public class Main {
    /**
     * Method to take an Animal object and call its makeSound() method.
     *
     * @param animal The Animal object whose makeSound() method needs to be called.
     */
    public static void makeAnimalSound(Animal animal) {
        animal.makeSound();
    }

    public static void main(String[] args) {
        // Testing different animal objects
        Animal dog = new Dog();
        Animal cat = new Cat();
        WildAnimal lion = new Lion();

        makeAnimalSound(dog); // Output: Bark
        makeAnimalSound(cat); // Output: Meow
        makeAnimalSound(lion); // Output: Roar
    }
}
