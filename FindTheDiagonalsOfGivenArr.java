package matrix;

public class FindTheDiagonalsOfGivenArr {

	/**
	 * Let’s say the diagonal is x, y and z. Where the sum of all rows are same
The value of x will be ( x2, 3 + x3, 2 ) / 2.
The value of z will be ( x1, 2 + x2, 1 ) / 2.
The value of y will be ( x + z ) / 2.
	 */
	private static void print(int[][]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	private static void find(int arr[][])  
	{  
	    arr[0][0] = (arr[1][2] + arr[2][1]) / 2;  
	    arr[2][2] = (arr[0][1] + arr[1][0]) / 2;  
	    arr[1][1] = (arr[0][0] + arr[1][1]) / 2;  
	  
	    // Print the new matrix with diagonals  
	    System.out.print( "Matrix with diagonals:\n");  
	    print(arr);  
	}  
	public static void main(String[] args) {
		int arr[][] = { { 0, 54, 48 },  
                { 36, 0, 78 },  
                { 66, 60, 0 } };  
		find(arr);

	}

}
