public class _01_Example {
    public static void main(String[] args) {
        Test t=new Test();
        t.show();
        t.display();
    }   
}


interface I1{
    void show();
}

interface I2{
    void display();
}

class Test implements I1,I2{
    public void show()
    {
        System.out.println("First interface is clled");
    }
    public void display()
    {
        System.out.println("Second interface is caled");
    }
}