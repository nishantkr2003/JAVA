public class _03_Example {
    public static void main(String[] args) {
        // Create an instance of the subclass (Dog)
        Dog myDog = new Dog("Buddy");

        // Access methods from both the superclass (Animal) and the subclass (Dog)
        myDog.eat();   // Inherited from Animal
        myDog.sleep(); // Inherited from Animal
        myDog.bark();  // Specific to Dog
    }
}



// Superclass (Parent class)
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Subclass (Child class)
class Dog extends Animal {
    Dog(String name) {
        super(name); // Call the constructor of the superclass (Animal)
    }

    void bark() {
        System.out.println(name + " is barking.");
    }
}

