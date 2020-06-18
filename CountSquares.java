package generalPrograms;

public class CountSquares {

	/**
	 * @param args
	 * Given a sample space S consisting of all perfect squares starting from 1, 4, 9 and so on. You are given a number N, you have to print the number of integers less than N in the sample space S
	 * 
	 * 
	 */
	
	private static boolean isItsquare(double n)
	{
		double n1=Math.sqrt(n);
		char[]sqrtn1=String.valueOf(n1).toCharArray();
		
		for(int i=0;i<sqrtn1.length;i++)
		{
			try
			{
			if(sqrtn1[i]=='.')
			{
			
				if((String.valueOf(n1).substring(i+1)).length()<=1)
				
				{
					
						
			
		
		if(n1*n1==n)
		{
			 System.out.println(n);
			 return true;
		}
		else
		 return false;
			
	}
			}		
	}
			
			catch(StringIndexOutOfBoundsException e) {
		         System.out.println("Exception occurred . . . . . . . . ");
		      }
				
			}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int num=100; int cnt=0;
             System.out.println("square numbers are ");
             for(int i=1;i<num;i++)
             {
            	
            	 if(isItsquare(i))
            	 {
            		 cnt++;
            		 
            		 System.out.println(i) ;
            	 }
            	 
             }
             
             System.out.println("Total no of square numbers are "+cnt);
	}

}
