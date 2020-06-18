package matrix;

public class MatrixTranspose {

	/**
	 * @param args
	 */
	private static void transposeOfMatrix(int[][]array)
	{
		int temp=0;
		
		for(int i=0;i<array.length;i++)
		{ 
			for(int j=i+1;j<array.length;j++)
			{
				temp=array[i][j];
				array[i][j]=array[j][i];
				array[j][i]=temp;
				
			}
			
		}
		
		for(int i=0;i<array.length;i++)
		{ 
			for(int j=0;j<array[0].length;j++)
			{
				System.out.print(array[i][j]+"");
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]array={{1,2,3},
				      {4,5,6},
				      {7,8,9},
				      };
		transposeOfMatrix(array);

	}

}
