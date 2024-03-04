import java.util.*;

public class Calculator {
    public static void main(String[] args) {

        String yn;
        do{
            Scanner sc=new Scanner(System.in);

            System.out.print("Enter first number:");
            int a=sc.nextInt();

            System.out.print("Enter second number:");
            int b=sc.nextInt();

            System.out.print("Select symbol(+-/*):");
            String sym=sc.next();

            int res;
            switch(sym)
            {
                case "+": res=a+b;
                        System.out.println("Addition is:"+res);
                        break;

                case "-": res=a-b;
                        System.out.println("Addition is:"+res);
                        break;

                case "*": res=a*b;
                        System.out.println("Addition is:"+res);
                        break;

                case "/": res=a/b;
                        System.out.println("Addition is:"+res);
                        break;
            
                default:
                    System.out.println("Invalid symbol");

            }
            System.out.println("Do you want to continue(Press y for yes nd n for No)");
            yn=sc.next();
        }
        while(yn.equals("y")||yn.equals("Y"));
    }
}
