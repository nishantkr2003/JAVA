

public class _02_Example{
    public static void main(String[] args) {
        
        Animal a=new Animal("Dog");
        a.eat();
        a.sleep();


        System.out.println("--------------------");
        Birds b=new Birds("Parrot");
        b.eat();
        b.sleep();
        b.fly();

        System.out.println("--------------------");
        Sparrow s=new Sparrow("Buddy");
        s.eat();
        s.sleep();
        s.fly();
        s.small();

    }
}


class Animal{
    String name;
    Animal(String name)
    {
        this.name=name;
    }
    void eat()
    {
        System.out.println(name + " is eating.");
    }
    void sleep()
    {
        System.out.println(name + " is Sleeping.");
    }
}

class Birds extends Animal{
    Birds(String name)
    {
        super(name);
    }
    void fly(){
        System.out.println(name + " is flying.");
    }
}

class Sparrow extends Birds{
    Sparrow(String name)
    {
        super(name);
    }

    void small()
    {
        System.out.println(name + " is small Bird.");
    }
}