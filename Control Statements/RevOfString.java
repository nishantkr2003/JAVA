public class RevOfString {
    public static void main(String[] args) {
        String s="Nishant kumar";
        String rev="";
        int lang=s.length();
        for(int i=lang-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.println("reverse of "+s+" is " + rev);
    }
}
