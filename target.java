
import java.util.*;
public class target {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int a[]=new int[x];
		int i;
		for(i=0;i<x;i++)
	    a[i]=s.nextInt();
		int t=s.nextInt();
		int m=0;
		for(i=0;i<x;i++)
		m=m+a[i];
		if(m==t)
		System.out.println("True");
		else
		System.out.println("False");
	}
}
