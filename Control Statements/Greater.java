import java.util.*;

//greatest of two number
/* 
public class Greater{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
 
        System.out.print("Enter a:");
        int a = sc.nextInt();

        System.out.print("Enter b:");
        int b = sc.nextInt();
        
        if(a>b)
        {
            System.out.print(a+" is greater");
        }
        else
        {
            System.out.print(b+" is greater");
        }
    }
}

*/

// Greatest of three number

public class Greater{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
 
        System.out.print("Enter a:");
        int a = sc.nextInt();

        System.out.print("Enter b:");
        int b = sc.nextInt();

        System.out.print("Enter c:");
        int c = sc.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a +" is greater");
            }
            else{
                System.out.println(c +" is greater");
            }
        }
        else if(b>c)
        {
            System.out.println(b +" is greater");
        }
        else
        {
            System.out.println(c +" is greater");
        }
    }
}