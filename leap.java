import java.io.*;
import java.util.*;
class leap
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int yr=s.nextInt();
        boolean f=false;
        if(yr%400==0)
        {
            f=true;
        }
        else if(yr%100==0)
        {
            f=false;
        }
        else if(yr%4==0)
        {
            f=true;
        }
        else
        {
            f=false;
        }
        if(f=true)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not Leap Year");
        }
    }
}
