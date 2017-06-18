import java.io.*;
import java.util.*;
class palindrome
{
    public static void main(String args[])
    {
       
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int n1=n;
    int rev=0,t=0;
    while(n>0)
    {
        t=n%10;
        rev=rev*10+t;
        n=n/10;
        
    }
    if(n1==rev)
    {
        System.out.println("Palindrome");
    }
    else
    {
        System.out.println("Not Palindrome");
    }
}
}







