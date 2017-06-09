import java.util.Scanner;
class poweroftwo {
public static void main(String[] args) {
System.out.println("Enter a number");
Scanner s = new Scanner(System.in);
int n=s.nextInt();
while((n !=2 && n % 2 == 0) || n ==1)
{
n = n /2;
}
if(n%2==0){
System.out.println("It is the power of two");
}else{
System.out.println("Its is not the power of two");
}        
}
}
