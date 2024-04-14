public class _01_Intro{
    public static void main(String[] args){

        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        shape.info();
        square.info();

        Shapes obj = new Triangle();
        obj.info();
        
    }
}

class Shapes {
    void info()
    {
        System.out.println("I am in shape class.");
    }
}


class Square extends Shapes {
    void info(){
        System.out.println("Inside Square class");
    }

}

class Triangle extends Shapes {
    void info(){
        System.out.println("Inside Triangle Class");
    }
}

class Circle extends Shapes {
    void info(){
        System.out.println("I am in Circle class");
        
    
    }
}     
