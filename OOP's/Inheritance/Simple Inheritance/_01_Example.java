


class Animal{
    //String color;

    void eat()
    {
        System.out.println("I am eating");
    }
    void breadth()
    {
        System.out.println("Breathing");
    }
}

class Fish extends Animal{
    //int fins;

    void swim(){
        System.out.println("Can swim");
    }

    
}



public class _01_Example{
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
        shark.breadth();
        shark.swim();
    }
}