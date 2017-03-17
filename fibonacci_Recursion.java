import java.util.Scanner;


public class fibonacci_Recursion {
	
	public static void main(String[]args)
	{
		int n=0; int n1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit to print the series");
		n=sc.nextInt();
		//n1=fibo(n);
		for (int counter = 0; counter <=n; counter++)
			System.out.println(fibo(counter));
	}
	
	private static int fibo(int n1) {
		if ((n1 == 0) || (n1 == 1)) // base cases
		      return n1;
    else
		return(fibo(n1-1)+fibo(n1-2));
		
}

	
	
	
	

}
