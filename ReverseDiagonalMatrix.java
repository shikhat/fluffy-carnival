package matrix;

public class ReverseDiagonalMatrix {

	private static void reverseDiagonal(int[][]arr)
	{
		
		int i=0;
		int j=arr[0].length; int temp=0;
		while(i<j)
		{
			temp=arr[i][i];
			arr[i][i]=arr[j-1][j-1];
			arr[j-1][j-1]=temp;
			
			 temp=arr[i][j-1];
			 arr[i][j-1]=arr[j-1][i];
			 arr[j-1][i]=temp;
			 
			 i++;
			 j--;
		}
		
		for(int i1=0;i1<arr.length;i1++)
		{
			for(int j1=0;j1<arr[0].length;j1++)
			{
				System.out.print(arr[i1][j1]+" ");
			}
			
			System.out.println();
		}
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int matrix[][] = {{1, 2, 3, 4}, 
                           {5, 6, 7, 8}, 
                           {9, 10, 11, 12}, 
                           {13, 14, 15, 16}}; 
reverseDiagonal(matrix); 

	}

}
