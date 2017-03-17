
public class IsPerfectNumber {
	
	public static void main(String a[]){
		int temp=0,i,j;
	for( i=6;i<=1000;i++)
	{
		for( j=1;j<=i/2;j++)
		
			if(i/j==0)
			{
				temp=temp+j;
				if(temp==i)
			   System.out.println("Perfect nos are"+ i);
			}
		
	}
	}

}
