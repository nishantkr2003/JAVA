public class Maths {
    int sum(int a,int b)
    {
        return a+b;
       // System.out.println(a+b);
    }
    int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    public static void main(String[] args) {
        Maths obj=new Maths();
        obj.sum(5,8);
        obj.sum(2,5,8);
    }
}
