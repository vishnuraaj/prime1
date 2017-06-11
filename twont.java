import java.util.Scanner;

public class twont {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
                System.out.println("Array Size");
              	int n=in.nextInt();
                int[] a=new int[n];
                System.out.println("Array elements");
                for(int i=0;i<n;i++)
                {
                 a[i]=in.nextInt();
                }
                System.out.println("Target");
                int k=in.nextInt();
                 for(int i=0;i<n;i++)
                 {
                     for(int j=0;j<n;j++)
                     {
                         if((a[i]+a[j])==k)
                         {
                             System.out.println(a[i]+" "+a[j]);
                             System.exit(0);
                             }
}
}
}
}
