import java.util.*;
class coprime
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=0,c1=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                c++;
            }
        }
        for(int i=1;i<b;i++)
        {
            if(b%i==0)
            {
                c1++;
            }
        }
        if((c==1)&&(c1==1))
        {
            System.out.print("Co-Prime");
        }
        else
        {
            System.out.print("Not Co-Prime");
        }
    }
}
