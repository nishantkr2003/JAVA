public class _02_Example {
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        c.stop();
        c.acc();
        c.brake();
    }
}



interface Brake {
    void brake();
}

interface Media {
    void start();
    void stop();
}



interface Engine {
    static final int price = 12000;
    void start();
    void stop();
    void acc();
}

class Car implements Brake,Engine{
    //@Override
    public void brake()
    {
        System.out.println("Brake");
    }
   // @Override
    public void start()
    {
        System.out.println("Start");
    }
   // @Override
    public void stop()
    {
        System.out.println("Stop");
    }
    //@Override
    public void acc()
    {
        System.out.println("Speed");
    }
}