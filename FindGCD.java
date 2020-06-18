package generalPrograms;

public class FindGCD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int n1=14; int n2=119; int rem=1; int gcd=0;
            
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
           
          System.out.println(gcd);  
	}

}
