package generalPrograms;

import java.util.ArrayList;

public class DecimalToBinary {

	public static void main(String[] args) {
		int n = 64;String str = " ";
		ArrayList <Integer> al = new ArrayList<Integer>();
		int rem=0;
		int div=n;
		 
		
		while(div!=0)
		{  
			rem=div%2;
			div=div/2;
			al.add(rem);
		}
	    
		for(int i=al.size()-1;i>=0;i--)
		{
			str=str+String.valueOf(al.get(i));
		}
		System.out.println(str);		

	}

}
