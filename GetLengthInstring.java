
public class GetLengthInstring {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="shikhashikha12";
		char[]ch=str.toCharArray();
		int loc=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{ loc=i-1;
				break;
			}
			
		}
		
		System.out.println(loc);
		int len1=str.substring(0, loc-1).length();
		System.out.println(str.substring(0, loc-1));
		String str1=str.substring(loc-1,str.length());
		//System.out.println(str1);
			if(len1==Integer.parseInt(str1))
			{
				System.out.println("hi");
			}
			else
			System.out.println("hi2");
		
		/////
			
	}

}
