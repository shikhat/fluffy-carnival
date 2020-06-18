package generalPrograms;

import java.util.Arrays;

public class EqualArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] ar1= {1,2,3,4,5,6};
		int[] ar2={2,5,4,1,3,6}; boolean equal =true;
		
		
		if(ar1.length!=ar2.length)
		{
			System.out.println("Arrays are not equal");
		}
		
		else
		{
			Arrays.sort(ar1);
			Arrays.sort(ar2);
			for(int i=0;i<ar1.length;i++)
			{
				if(ar1[i]==ar2[i])
				{
					
					continue;
				}
		
				else
				{
					equal=false;
					break;
				}
			}
			
			if(equal)
			
			System.out.println("Arrays are  equal");
			
			else
				System.out.println("Arrays are not equal");	
		}

	}

}
