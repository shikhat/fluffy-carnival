import java.util.Scanner;


public class Fibonacci {
	
	public static void main(String[]args)
	{
		int n=0; int n1=0,n2=1,sum=0;
		
		
		System.out.println("Enter the number you want to print");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		System.out.println(n1);
		System.out.println(n2);
		for(int i=0;i<n;i++)
		{
			
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.println(sum);
		
	}

}
}