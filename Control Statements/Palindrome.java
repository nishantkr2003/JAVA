public class Palindrome {
    public static void main(String[] args) {
        int n=2003,rem;
        int temp=n;
        int rev=0;
        while(temp!=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(n==rev)
        {
            System.out.println(n+" is Palindrome");
        }
        else
        {
            System.out.println(n+" is not Palindrome");
        }
    }
}
