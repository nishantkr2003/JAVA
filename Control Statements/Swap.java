
/* 
public class Swap {
    public static void main(String[] args) {
        int a=20,b=30;
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}
*/

// without temperary veriable

public class Swap{
    public static void main(String[] args) {
        int a=10,b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}