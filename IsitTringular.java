package generalPrograms;

public class IsitTringular {

	/**
	 * @param args
	 * Check whether the number is Triangular or not.
	 * For example 6 and 10 are traingular becoz
	 *  6 =(1+2+3) and  10 = (1+2+3+4).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i=0; int checknum=7;
		while(sum!=checknum)
		{
			sum=sum+i;
			System.out.println("i "+i);
			i++;
			
			if(sum>checknum)
			{
				System.out.println("No The given no" +checknum  + "is not Triangular");
			    break;
			}
			
			else if(sum==checknum)
			{
				System.out.println("Yes The given no " +checknum  + " is Triangular");
			}
				
		}
			
				
				
			
			
			
				
		
        
		//System.out.println("Yes Triangular");
	}

}
