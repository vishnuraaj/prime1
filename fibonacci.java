import java.io.*;
import java.util.*;
class fibonacci
{
    public static void main(String args[])
    {
        
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int a=0,b=1,c;
       for(int i=0;i<n;i++)
       {
           c=a+b;
           System.out.print(" "+a);
           a=b;
           b=c;
       }
       
    }
}


