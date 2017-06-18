import java.util.*;
class deldu
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        for(int i=0;i<s1.length();i++)
        {
            int c=0;
            for(int j=0;j<s1.length();j++)
            {
                if(s1.charAt(i)==s1.charAt(j))
                {
                    c++;
                }
            }
            if(c==1)
            {
                System.out.print(s1.charAt(i));
            }
        }
    }
}
