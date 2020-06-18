package generalPrograms;
import java.util.*;

public class HashMapReplaceMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		
		map.put('a', 200);
		map.put('b', 300);
		map.put('c', 400);
		map.put('d', 500);
		
		int k=map.replace('b', 600);
		
		System.out.println("Previous value of b was "+k);
		System.out.println("UPDATED MAP");
		System.out.println(map.toString());

	}

}
