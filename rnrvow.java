import java.io.*;
import java.util.*;
class rnrvow
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str = s.nextLine();
char[] st = str.toCharArray();
for (int i=st.length-1;i>=0;i--)
{
    System.out.print(st[i]); 
}
String str1=String.valueOf(st);
String sttr=str1.replaceAll("[aeiouAEIOU]", "");
System.out.println();
System.out.println(sttr);
System.out.println("Vowels Removed");
}
}





