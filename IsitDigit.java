package generalPrograms;

import java.util.Scanner;

public class IsitDigit {

	private static boolean isNumberOrNot(String str)
	{
	  try
		{
			Integer.parseInt(str);
		}
	  
	  catch(NumberFormatException ex)
	  {
		return false;  
	  }
		
	  return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter something");
		String str=sc.next();
		
		if(isNumberOrNot(str))
		{
			System.out.println("It is a digit");
		}
		
		else
			System.out.println("It is not a digit");
	}

}
