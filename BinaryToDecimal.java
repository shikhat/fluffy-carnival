import java.util.Scanner;


public class BinaryToDecimal {
	
	public static void main(String[]args)
	{
		int n=0; int []arr1; int temp=0; int rem=0; int cnt=0;int k=0;
		
		     
		  String str="";
	
			Scanner in=new Scanner(System.in);
		    System.out.println("Enter a  number to convert into Decimal");
	    	str=in.next();
	    	arr1=new int[str.length()];
	    	int sum=0;
	    	boolean flag=false;
	    	for(int i=0;i<str.length();i++)
	    	{
	    		arr1[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
	    		if(arr1[i]==0 || arr1[i]==1)
	    		{
	    			sum=power(arr1);
	    			flag=true;
	    	    }
	    			
	    	
	    
	    	else
	    	{
	    		flag=false;
	    		System.out.println("Invaid input!! Please try again");
	    	    break;
	    	}
	    		
	}
	    	
	    	if(flag==true)
	    	System.out.println(sum);
	    		
	}
	   	  static int power(int[]arr) {
	    		
	    		//list1=Arrays.asList(l);
	    		int sum1=0;
	    		for(int k=arr.length-1;k>=0;k--)
	    			{
	    				int at2=(arr[k]*pow(2,k));
	    				sum1=sum1+at2;
	    				System.out.println("arr[k]:"+arr[k]);	 
	    				System.out.println("k:"+k);	    				System.out.println("sum1:"+sum1);
	    			}
					return sum1;
	    		}
	    		
	    		static int pow(int base, int power)
	    		{
	    			int temp=1; int cnt=0;int mul=0;
	    			if(power==0)
	    			{
	    				//System.out.println(1);
	    				return 1;
	    			}
	    			else
	    			{
	    				while(cnt!=power)
	    				{
	    					mul=temp*base;
	    					temp=mul;
	    					cnt++;
	    				}
	    			
	    			return mul;
	    			}
	    			
	    				
	    				
	    			
	    		}

	    	
	}


