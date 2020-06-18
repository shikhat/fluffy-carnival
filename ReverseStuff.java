package generalPrograms;
import java.util.*;

public class ReverseStuff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList <Integer> al=new ArrayList();
	//	List <Integer> al1=new ArrayList();
		
		
		
		for(int i=1;i<10;i++)
		{
			al.add(i);
		}
		
		Collections.reverse(al);
		 System.out.println("ArrayList After Reverse :");
         
	        System.out.println(al);

	}

}
