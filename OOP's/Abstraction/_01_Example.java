
public class _01_Example {

    public static void main(String[] args) {
        Car c=new Car();
        c.start();

        Scooter s=new Scooter();
        s.start();
    }
}

abstract class Vehicle{
    abstract void start();
    
}

class Car extends Vehicle{
    void start()
    {
        System.out.println("Car starts with key");
    }
}

class Scooter extends Vehicle{
    void start()
    {
        System.out.println("Scooter starts with key");
    }
}