package matrix;

public class SquareODMatrix {

	/**
	 * @param args
	 */
	private static int[][] getTheSquare(int[][]array)
	{
		
		int[][] product = new int[3][3];
		for(int i=0;i<3;i++)
		{
		 for(int j=0;j<3;j++)
			{
			for(int k=0;k<3;k++)
				{
			 
				 product[i][j] += array[i][k] * array[k][j];
			 
			 }
			// product[i][j]=array[i][j]*array[i][j];
			 
		}
		
		}
		for(int i=0;i<3;i++)
		{
		 for(int j=0;j<3;j++)
			{
			 
			   System.out.print(product[i][j]+" ");
			 
			 }
		 System.out.println();
		}
		return product;
	}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array={{1,2,3},
				          {4,5,6},
				          {7,8,9}};
		int[][] product = getTheSquare(array);

	}

}
