import java.util.ArrayList;


public class FindingDuplicate {
	
	public static void main(String[]arg)
	{
		int[]num={12,12,10,23,5,7,7,6,8,8};
		
		ArrayList<Integer>dup = new ArrayList<Integer>();
		
		for(int i=0;i<num.length;i++)
		{
			if(!dup.contains(num[i]))
			{
				//System.out.println( "This is duplicate"+num[i]);
				dup.add(num[i]);
			}
				/*else
				{
				dup.add(num[i]);
				}*/
			}
		
		for(int i=0;i<dup.size();i++)
		{
			System.out.println(dup.get(i));
		}
	}

}
