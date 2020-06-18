package matrix;

public class PrintSubDiagonal {

	public static void printTheSubDiagonal(int [][] ar)
	{
		int j=ar[0].length;  System.out.println(j);
		for(int i=0;i<ar.length;i++)
		{
			if(i+1<j)
			{
			  System.out.println(ar[i][i+1]); 
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array={{1,2,3,4},
		                {4,5,6,5},
		                {7,8,9,10}};
printTheSubDiagonal(array);

	}

}
