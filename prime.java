import java.util.*;
class prime
{
    public static void main(String args[])
    {
       
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int c=0;
    for(int i=2;i<n;i++)
    {
        if(n%i==0)
        {
            c++;
            
        }
    }
    if(c==0)
    {
        System.out.println("Prime");
    }
    else
    {
        System.out.println("Not Prime");
    }
}
}







