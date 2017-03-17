import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class DeciToBinary {

	static java.util.List<ArrayList<Integer>> list1=new ArrayList();
	
	public static void main(String[]args)
	{
		int n=0; int []arr1=new int[10]; int temp=0; int rem=0; int cnt=0;int k=0;
		
		
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter a decimal number to convert into binary");
		n=in.nextInt();
		
		while(n>0)
		{
		 temp=n/2; 
		  rem=n%2;
		  n=temp;
		  arr1[k++]=rem;
		//  list1.add(rem);
		}
		
		for(int i = k-1;i >= 0;i--){

            System.out.print(arr1[i]);

        }


	/*private static int power(ArrayList<Integer>l) {
		
	list1=Arrays.asList(l);
	int sum1=0;
		
		for(int k=0;k<l.size();k++)
		{
			int at2=(l.get(k)*pow(2,k));
			
			sum1=sum1+at2;
		}
		
		
		}
	
	static int pow(int base, int power)
	{
		int temp=1; int cnt=1;int mul=0;
		if(power==0)
			return 1;
		else
			while(cnt!=power)
			{
				mul=temp*power;
				temp=mul;
				cnt++;
			}
		return mul;
			
			
		
	}*/
	
	}
}
