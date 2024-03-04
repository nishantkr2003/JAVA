import java.util.*;

/* 
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Year: ");
        int a=sc.nextInt();

        if(a%4==0)
        {
            if(a%400==0)
            {
                System.out.println("Leap Year");
            }
            else
            {
                System.out.println("Not leap Year");
            }
        }
        else
        {
            System.out.println("Not");
        }
    }
}


*/

public class LeapYear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Year: ");
        int a=sc.nextInt();



        if ((a%400==0) || (a%4==0 && a%100!=0))
        {
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }
    }
}