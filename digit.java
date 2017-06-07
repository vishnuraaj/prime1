import java.io.*;
import java.util.*;
class digit
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0;
        while(n>0)
        {
            n=n/10;
            a++;
        }
        System.out.println(a);
    }
}

