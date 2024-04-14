// package _02_Compile_Time_Polymorphism;

public class Main {
    
//  {Same class, same Name and different argument(No of argument,seq. of argu and Type of argu)}

    void show()
    {
        System.out.println("1");
    }

    void show(int a)
    {
        System.out.println("2");
    }
    void show(int a,String b)
    {
        System.out.println("different sequence");
    }
    void show(String a,int b)
    {
        System.out.println("Different sequence of argument");
    }
    {
        System.out.println("different sequence");
    }
    public static void main(String[] args) {
        Main m=new Main();
        m.show();               //1
        m.show(10);           //2
        m.show("abc",10);   //Different sequence of argument
        m.show(10,"abc");   //different sequence
    }
}
