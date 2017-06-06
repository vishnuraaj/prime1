import java.util.Scanner;
class chrn
{
 public static void main(String[] args)
  {
   Scanner in = new Scanner(System.in);
   String line = in.nextLine();
   char c = line.charAt(0);
   if( Character.isLetter(c))
   System.out.printf("Alphabet");
   else
   System.out.printf("Not Alphabet");
  }

}
