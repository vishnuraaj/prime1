import java.util.*;
class encryption
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String s1=s.next().toLowerCase();
        String s2=s.next().toLowerCase();
        //char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        for(int i=0;i<s1.length();i++)
        {
            int a=(int)s1.charAt(i)+10;
            System.out.print((char)a);
        }
        System.out.println();
        for(int j=1;j<c2.length-1;j++)
        {
            int a1=(int)c2[j]+10;
            if(a1>122)
            {
                a1=122-a1;
                if(a1>0)
                {
                    a1+=96;
                }
                else
                {
                    int temp=a1*(-1);
                    a1=temp+96;
                }
                c2[j]=(char)a1;
            }
            else
            {
                c2[j]=(char)a1;
            }
        }
        String s3=new String(c2);
        System.out.print(s3);
    }
}
