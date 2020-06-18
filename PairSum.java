package generalPrograms;

public class PairSum {

	/**
	 * @param args
	 */
	
	public static boolean isItInAArray(int []ar,int n,int n2)
	{
		boolean isIt=false;
		for(int i=n2+1;i<ar.length;i++)
		{
			if(n==ar[i])
			{
				isIt=true;
			}
			
			
		}
		
		return isIt;
		
	}
	public static void main(String[] args) {
		int[]ar1={4, 5, 7, 11, 9, 13, 8, 12};
		
		int num=20;int n1=0; int pair[]=new int[2];
		
		for(int i=0;i<ar1.length;i++)
		{
			n1=20-ar1[i];
			if(isItInAArray(ar1,n1,i))
			{
				pair[0]=n1;
				pair[1]=20-n1;
				System.out.println(pair[0]+","+pair[1]);
				
			}
			
			
		}
		
		 
		

	}

}
