package generalPrograms;
import java.util.*;
/*
 * 
 * Given a value N. The task is to find how many numbers less than or equal to N have numbers of divisors exactly equal to 3.
 */
public class FindDivisors
{
	public static void main(String[]args)
	{
		ArrayList<Integer>al=new ArrayList<Integer>();
		int num=96; int cnt=0;
		int x=0;
		for(int i=1;i<=num;i++)
		{
			cnt=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					x=i;//al.add(i);
				  cnt++;	
				}
			}
		
			if(cnt==3)
			{
				al.add(x);
				
			}
		}
		System.out.println(al);
		
	}
}