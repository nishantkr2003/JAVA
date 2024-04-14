/*
   1.Same Name
   2.Different class
   3.same Argument (no of argument,type of argument,seq of argument)
   4.Inheritance(Is-A relationship)
 */

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();      // Create a Animal object
        Animal myPig = new Pig();           // Create a Pig object
        Animal myDog = new Dog();           // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}
