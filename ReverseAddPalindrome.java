package generalPrograms;

public class ReverseAddPalindrome {

	/**
	 * @param args
	 */
	 private static int reverseNum(int n)
	 {
		 int n1=0; int rem=0;
		 while(n!=0)
		 {
		 rem=n%10;
		 n1=(n1*10)+rem;
		 n=n/10;
		 }
		 return n1;
		 
	 }
	 
	 private static boolean isItPalindrome(int num1)
	 {
		 if(reverseNum(num1)==num1)
		 {
			 return true;
		 }
		 
		 return false;
	 }
	 
	public static void main(String[] args) {
		
      /// int num = 5119;
		int num = 141;
      if(isItPalindrome(num))
      {
    	  System.out.println("it is already Palindrome" );
      }
      
      else{
    	  while(!isItPalindrome(num))
          {
    		 int reverse= reverseNum(num);
    		 int sum=num+reverse;
    		 System.out.println(num+"+"+reverse+"="+sum);
    		 num=sum;
          }
      
    	  
      }
    	  
    	  
    	  
       
	}

}
