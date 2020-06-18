package matrix;

import java.util.Scanner;

public class Matrixaddition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int row=3; int col=3;
		Scanner sc = new Scanner(System.in);
		
		int matrix1[][] = new int[row][col];
		int matrix2[][] = new int[row][col];
		int matrix3[][] = new int[row][col];
		System.out.println("Enter elements for the matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				
			{
				matrix1[i][j]=sc.nextInt();
		      matrix2[i][j]=sc.nextInt();
			}
		}
			

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				
			{
				matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
				
				System.out.print(matrix3[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
