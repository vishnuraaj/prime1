import java.io.*;
import java.util.*;
class reverse
{
    public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str = s.next();
char[] st = str.toCharArray();
for (int i=st.length-1;i>=0;i--)
{
    System.out.print(st[i]);     
}    
}
}

