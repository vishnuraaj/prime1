import java.util.Scanner;
public class vowela
{
    public static void main(String args[])
    {
        char ch;
        Scanner scan = new Scanner(System.in);
        ch = scan.next().charAt(0);
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
        {
            System.out.print("This is a Vowel");
        }
        else
        {
            System.out.print("This is Consonant");
        }
    }
}
