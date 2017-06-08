import java.util.*;
class happy
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int x=s.nextInt();
int y;
while(x!=1)
{
int z=0;
while(x>0)
{
y=x%10;
z+=(y*y);
x=x/10;
}
if(z==1)
{
System.out.println("Happy Number");
System.exit(0);
}
x=z;
}
System.out.println("Not Happy Number");
}
}


