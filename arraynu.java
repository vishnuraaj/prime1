import java.util.*;
class arraynu
{
    public static void main(String args[])
    {
        int c=0,i,j;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==i)
            {
                System.out.println(i);
                System.exit(0);
            }
        }
        
    }
}

