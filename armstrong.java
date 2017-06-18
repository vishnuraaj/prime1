import java.util.*;
class armstrong
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int n1=n;
        int mul=0,t;
        while(n>0)
        {
            t=n%10;
            mul=mul+(t*t*t);
            n=n/10;
        }
        if(mul==n1)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Amstrong Number");
        }
    }
}
