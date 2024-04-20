// Task 1: Animal interface
interface Animal {
    void makeSound();
}

// Task 2: Pet interface
interface Pet {
    void beFriendly();
    void play();
}

// Task 3: WildAnimal interface
interface WildAnimal extends Animal {
    void hunt();
}

// Dog class implementing Animal and Pet interfaces
class Dog implements Animal, Pet {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void beFriendly() {
        System.out.println("Dog is friendly");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing fetch");
    }
}

// Cat class implementing Animal and Pet interfaces
class Cat implements Animal, Pet {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void beFriendly() {
        System.out.println("Cat is friendly");
    }

    @Override
    public void play() {
        System.out.println("Cat is playing with a toy");
    }
}

// Lion class implementing WildAnimal interface
class Lion implements WildAnimal {
    @Override
    public void makeSound() {
        System.out.println("Roar");
    }

    @Override
    public void hunt() {
        System.out.println("Lion is hunting for prey");
    }
}

public class Main {
    // Task 4: Method to take Animal object and call makeSound()
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