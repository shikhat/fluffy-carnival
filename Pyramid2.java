package generalPrograms;

public class Pyramid2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=7;
		 int k1=0;
		 for(int i=1;i<=n;i++)
		 {
		    for(int j=1;j<=n-k1;j++)
			{
		        System.out.print(j);
			}
			
			 System.out.println();
			 k1++;
			 }
			 
			 int k=0;
			 for(int i=1;i<=n-1;i++)
		     { 
				
		     for(int j=1;j<=n-1-k;j++)
			  {
		        System.out.print(j);
		        
			  }
		     System.out.println();
		     k++;
			}

	}

}
