import java.util.*;
class focc
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String x=s.next();
        String x2=s.next();
        char c=x2.charAt(0);
        int start=x.indexOf(c);
        if(x.contains(x2))
        System.out.println(start);  
        else
        System.out.print("1");
    }
}


