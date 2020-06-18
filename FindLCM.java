package generalPrograms;

public class FindLCM {

	/**
	 * @param args
	 */
	private static int getGCD(int n1, int n2)
	{
	 int rem=1; int gcd=0;
    
    while(rem!=0)
    {
      rem=n2%n1;
      if(rem==0)
      {
    	  gcd=n1;
      }
      n2=n1;
      n1=rem;
      
    }
    return gcd;
	}
	
	private static int getLCM(int n1, int n2)
	{
		int gcd=getGCD(n1,n2);
		int lcm=n1*n2/gcd;
		return lcm;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=4; int n2=10;
		System.out.println(getLCM(n1, n2));
		
	}

}
