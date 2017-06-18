import java.util.*;
class panagram
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        Set<String> s1=new TreeSet<String>();
        String str[]=s.nextLine().toUpperCase().replace(" ","").split("");
        for(String q:str)
        {
            s1.add(q);
        }
        if(s1.size()==26)
        {
            System.out.println("Panagram");
        }
        else
        {
            System.out.println("Not Panagram");
        }
    }
}
