import java.util.Scanner;


public class Armstrong {
	
	private static int power(int r, int n) {
		// TODO Auto-generated method stub
		int p=1;
		for(int i=1;i<=n;i++)
		{
		 p=p*r;
		}
		
		return p;
	}

	
	public static void main(String args[])
	{
		int input=1604;
		//Scanner in=new Scanner(System.in);
		//System.out.println("Enter a string to reverse");
	   System.out.println("Here is the number:"+input);
	    
	    int temp=input;
	    int n=0;
	     while(temp!=0)
	     {
	    	 
	    	 temp = temp/10;
	    	 n++;
	   }
	     System.out.println(n);
	     
	      temp=input; 
	      int sum=0;
	      while(temp!=0)
		     {
		    	int r = temp%10;
		    	sum = sum+power(r,n);
		    	System.out.println("Power::"+power(r,n));
		    	temp = temp/10;
		   }
	      System.out.println("SUM::"+sum);
	      System.out.println("TEMP::"+input);
	      if (input == sum)
	          System.out.println(input + " is an Armstrong number.");
	       else
	          System.out.println(input + " is not an Armstrong number.");
		
		
	}

	
	

}
