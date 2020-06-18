package generalPrograms;

public class FindNthEvenFiboNum {

	/**
	 * @param args
	 * 
	 * 
	 * Given a positive integer N, find the Nth Even Fibonacci number
	 */
	public static void main(String[] args) {
		   int n1=0;
		   int n2=1;
		   int n3=0;
		   int cnt=0;
		   int i=0;
		   while(cnt!=5)
		   {
		      n3=n1+n2;
		      n1=n2;
		      n2=n3;
		     if(n3%2==0)
		     {  
		      cnt++;  
		      
		      }
		     
		     i++;
		    
		     }
		   System.out.println(n3);
		   
	}

}
