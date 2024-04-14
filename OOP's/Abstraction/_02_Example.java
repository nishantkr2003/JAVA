
public class _02_Example {
    public static void main(String[] args) {
        Child son = new Child(24);
        son.career("Devops Engineer");
        son.partner("Aditi Rathore");

        Child daughter = new Child(24);
        daughter.career("F1 Racer");
        daughter.partner("Rishabh Saini");

        // Parent obj = new Parent(23) ;
        // we cannot create object of abstract class ==> bcz then it will call
        // abstract methods which have no body and therefore we also cannot have
        // abstract constructor.
        Parent.greetings();
    }
}

abstract class Parent {
    int age;

    // can we create a constructor of Abstract class
    // ==> we can create constructor of Abstract class
    Parent(int age) 
    {
        this.age = age;
    }

    // can we create a abstract constructor
    // ==> no we cannot
    // abstract Parent(){} // no we cannot

    // can we have abstract static methods ==> abstract methods are the methods that
    // are to be overridden but we cannot override static methods as they are not
    // dependent on the instance of a class, they are instance independent

    // can we create normal methods inside abstract class
    static void greetings() {
        System.out.println("Hello!!!");
    }

    abstract void career(String name);

    abstract void partner(String name);
}

class Child extends Parent {
    Child(int age) 
    {
        super(age);
    }

    @Override
    void career(String name) {
        System.out.println("I am going to be a " + name);
    }

    @Override
    void partner(String name) {
        System.out.println("I love " + name);
    }
}
