import java.io.*;
import java.util.*;
class reversenum
{
public static void main(String args[])
{
int rev=0;   
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(n>0)
{
rev=rev*10;
rev=rev+n%10;
n=n/10;
}
System.out.println(rev) ;
}
}


