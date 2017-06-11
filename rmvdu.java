import java.io.*;
class rmvdu
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any word:");
        String s=br.readLine();
        int l=s.length();
        char ch;
        String optput="";
        for(int i=0; i<l; i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            output+=ch;
            s=s.replace(ch,' '); 
            }
        System.out.println("Word after removing duplicate characters:"+output);
    }
}
