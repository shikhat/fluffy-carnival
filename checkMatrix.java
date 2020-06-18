package matrix;

import java.util.Arrays;

public class checkMatrix {

	
	private static boolean check(int[][]a, int [][]b)
	{
		//Boolean val=false;
		int c[][]=new int [3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				
				c[i][j]=a[j][i];
				
				
			}
				
		}
		
		if(Arrays.deepEquals(b, c))
		return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; 
	     int b[][] = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}; 
	  
	        if (check(a, b))  
	        { 
	            System.out.println("Yes"); 
	        }  
	        else 
	        { 
	            System.out.println("No"); 
	        } 
	    } 

	}


