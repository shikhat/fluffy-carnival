package matrix;

import java.util.Scanner;

public class MatrixCreation {

	
	public static void main(String[] args) {
		
		int row=3; int col=3;
		Scanner sc = new Scanner(System.in);
		
		int matrix[][] = new int[row][col];
		System.out.println("Enter elements for the matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				
			{
				matrix[i][j]=sc.nextInt();
			}
		}
			

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
