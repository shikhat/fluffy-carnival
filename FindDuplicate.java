package generalPrograms;
import java.util.*;
import java.util.Map.Entry;

public class FindDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str="cabbbbcccd";
		Map<Character,Integer> hm = new LinkedHashMap <Character,Integer> ();
		Map<Character,Integer> hm1 = new LinkedHashMap <Character,Integer> ();
		for(int i=0;i<str.length();i++)
		{
			
			if(hm.containsKey(str.charAt(i)))
			{
				hm.put(str.charAt(i) , hm.get(str.charAt(i))+1);
			//	hm.put(str.charAt(i) , i);
			}
			
			else
			{
				hm.put(str.charAt(i), 1);
			}
			
			hm1.put(str.charAt(i) , i);
		}
		
		
		
		  Set<Character> hs= new  HashSet <Character>();
		   hs=hm.keySet();
		   List<Integer> al =new ArrayList<Integer>();
		   List<Character> al1 =new ArrayList<Character>();
		    for(char c:hs)
		    {
		    	
		    	System.out.println(c +":"+hm.get(c));
		    	al.add(hm.get(c));
		    }
		    int max=al.get(0);;
		    for(int i=1;i<al.size();i++)
		    {
		    	
		    	if(max<al.get(i))
		    		max=al.get(i);
		    }
		    System.out.println(max);
		    
		    for (Entry<Character, Integer> entry : hm.entrySet()) {
	            if (entry.getValue().equals(max)) {
	            	
	            	al1.add((char)entry.getKey());
	                //System.out.println(entry.getKey());
	            }	}
		    System.out.println(al1.get(0)); 
	}
		    	
		    
	

}
