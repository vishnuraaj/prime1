import java.util.*;
class keypress
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0);
        if(c=='Q' || c=='q')
        {
            System.exit(0);
        }
        else
        {
            System.out.print(c+" ");
        }
    }
}

