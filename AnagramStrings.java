package generalPrograms;

import java.util.Arrays;

public class AnagramStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str1="Mother In Law"; boolean equal =true;
		String str2="Hitler Woman";
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
	    str1=str1.replaceAll("\\s", "");
	    str2=str2.replaceAll("\\s", "");
	    
	    
	   char[]strchar1=str1.toCharArray();
	   char[]strchar2=str2.toCharArray();
	   
	   if(strchar1.length!=strchar2.length)
	   {
		   System.out.println("Arrays are not equal");
	   }

	   else
	   {
		    Arrays.sort(strchar1);
			Arrays.sort(strchar2);
			for(int i=0;i<strchar1.length;i++)
			{
				if(strchar1[i]==strchar2[i])
				{
					continue;
				}
				
				else
				{
					equal =false;
					break;
				}
				
				
			}
			
			if(equal)
			
				 System.out.println("String are Anagram");
			
			else
				 System.out.println("String are not Anagram");
			
	   }
	   
	}

}
