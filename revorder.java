import java.util.*;
class revorder
{
public static void main(String args[])
{
Scanner s=new Sacnner(System.in);
String s1[]=s.nextLine().split(" ");
String str="";
for(int i=s1.length-1;i>=0;i--)
{
str=str+s1[i]+" ";
}
System.out.println(str);
}
}
