import java.util.*;
class multiplication
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int n1=s.nextInt();
        for(int i=1;i<=n1;i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
