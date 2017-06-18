import java.util.*;
class oddin
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int n1=s.nextInt();
        for(int i=n;i<n1;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
}
