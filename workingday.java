import java.util.*;
class workingday
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.next().toLowerCase();
        if(str.equals("sun")||str.equals("sat"))
        {
            System.out.print("False");
        }
        else
        {
            System.out.print("True");
        }
    }
}
