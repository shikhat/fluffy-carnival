package generalPrograms;

public class BinaryToDecimal {

	private static int powerOnTwo(int power)
	{
		
	
		int ans=(int) Math.pow(2, power);	
		return ans;
	}
	
	public static void main(String[] args) {
		
		String binary="1111"; int decimalVal=0;
		char []chrbinary=binary.toCharArray(); int power=0; int i=0;
		for(i=chrbinary.length-1;i>=0;i--)
		{
		    int n1 =powerOnTwo(power); 
		    int n= Character.getNumericValue(chrbinary[i]);
			int k =  n1*n ;
			
			decimalVal=decimalVal+k;
			power++;
		}
	
		System.out.println(decimalVal);

	}

}
