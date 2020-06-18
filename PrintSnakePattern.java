package matrix;

public class PrintSnakePattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
		
		for(int i=0;i<4;i++)
		{
			if(i%2==0)
			{	
			for(int j=0;j<4;j++)
			{
				
				 System.out.print(mat[i][j]+" ");
				
			}
			}
			else if(i%2==1)
			{
				for(int j=3;j>=0;j--)
				{
					
					 System.out.print(mat[i][j]+" ");
					
				}
			}
				
		}

	}

}
