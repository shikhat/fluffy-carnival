package matrix;

/*
 * he matrix M is said to be idempotent matrix if and only if M * M = M. 
 * In idempotent matrix M is a square matrix.
 */


public class ChkIdempotent {

	private static boolean multiply(int[][]arr, int[][]res)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				res[i][j] = 0;
				for(int k=0;k<arr.length;k++)
				{
					res[i][j]=res[i][j]+arr[i][k]*arr[k][j];
				}
			}
				
		}
		return false;
		
	}
	
	static boolean checkIdempotent(int mat[][]) 
    {  
        // Calculate multiplication of matrix 
        // with itself and store it into res. 
        int res[][] = new int[3][3]; 
        multiply(mat, res); 
      
        for (int i = 0; i < 3; i++) 
        {  
            for (int j = 0; j < 3; j++) 
            { 
                if (mat[i][j] != res[i][j]) 
                    return false; 
            } 
        } 
        return true; 
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = {{2, -2, -4}, 
                {-1, 3, 4}, 
                {1, -20, -3}}; 

 // checkIdempotent function call. 
 if (checkIdempotent(mat)) 
     System.out.println( "Idempotent Matrix"); 
 else
     System.out.println("Not Idempotent Matrix."); 
   

	}

}
