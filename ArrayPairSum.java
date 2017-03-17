
import java.util.*;

public class ArrayPairSum {


public static void main(String[] args) {        

    int []a = {45,2,7,3,5,1,8,11};
    
   
    printSumPairs(a,10);
    

}


public static void printSumPairs(int []input, int k){
    Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
     int []num=new int[2];
    ArrayList<Integer>newAssetList = new ArrayList<Integer>();
    for(int i=0;i<input.length;i++){
    newAssetList.add(input[i]);
    }
    
     
  int cnt=0;
    for(int i=0;i<input.length;i++){

        if(pairs.containsKey(k-input[i]))
        {
        	
            System.out.println(k-input[i] +", "+ pairs.get(k-input[i]));
             System.out.println(newAssetList.indexOf(k-input[i]));
        	System.out.println(newAssetList.indexOf(input[i]));
            
         }
        else
        {
             pairs.put(input[i], k-input[i]);
             
         }
        
       
        
    	
       // System.out.println(num[0]+" "+num[1]);
    }
    
    
    
   }
    
}
