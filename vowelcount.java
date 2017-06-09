import java.io.*;
class vowelcount
{
public static void main(String args[]) throws IOException
{
int vowels = 0;
char ch;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a String : ");
String str = br.readLine();
for(int i = 0; i < str.length(); i ++)
{
ch = str.charAt(i);
if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' ||	ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
vowels ++;
}
System.out.println("Number of vowels : " + vowels);
}
}
