package generalPrograms;

public class checkThePower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=2; int n2=116; int rem=1;
		int saven1=n1;int saven2=n2;
		
		if(n2%n1==0 && n1!=1)
		{
		while(n2!=1)
		{
			rem=n2%n1;
			
			if(rem!=0)
			{
				System.out.println(saven2+" not a power of "+saven1);
				break;
			}
			else
			{
			n2=n2/n1;
			int n3=n2;
			if(n3==1 && rem==0)
			{
				break;
			}
			}
	    }
		
		
		}
		
		else if(n2%n1!=0||n1==1)
		{
			System.out.println("invalid nos");
		}

		
		
			 System.out.println(saven2+" is a power of "+saven1);
		
	}

}
