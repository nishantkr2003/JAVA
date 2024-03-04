public class Armstrong {
    public static void main(String[] args) {
        int n=153;
        int t1=n;
        int l=0;
        while(t1!=0)
        {
            l=l+1;
            t1=t1/10;
        }
        int t2=n;
        int rem;
        int arm=0;
        while(t2!=0)
        {
            int mul=1;
            rem=t2%10;
            for(int i=1;i<=l;i++)
            {
                mul=mul*rem;
            }
            arm=arm+mul;
            t2=t2/10;
        }
        if(arm==n)
        {
            System.out.println(n+" is an Armstrong number");
        }
        else
        {
            System.out.println(n+" is an not Armstrong number");
        }
    }
}
