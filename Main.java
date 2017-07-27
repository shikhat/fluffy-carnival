import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	
	public void getandarrangedData (ArrayList<Cubeclass> arr)
	{
		
		ArrayList<Integer> ar2=new ArrayList<Integer>();
		ArrayList<Integer> ar3=new ArrayList<Integer>();
		
		for(int i=0;i<arr.size();i++)
		{
			ar2.add((arr.get(i)).height);
		    ar3.add((arr.get(i)).width);
		}
		finalSorting(ar2,ar3);
	}
	
	

	private void finalSorting(ArrayList<Integer>ar1,ArrayList<Integer>ar2)
	{
		Collections.sort(ar1);
		Collections.sort(ar2);
		
		System.out.println("Here is the height in ascending order");
		for(int i=0;i<ar1.size();i++)
		{
		System.out.println(ar1.get(i));
		}
		System.out.println("Here is the width in descending order");
		for(int i=ar2.size()-1;i>=0;i--)
		{
		System.out.println(ar2.get(i));
		}
	}
	
	public static void main(String[] args) {
		ArrayList ar1=new ArrayList<Cubeclass>();
		Main m=new Main();
		Scanner scanner = new Scanner(System.in);
	     int h1=0;
		 int w=0;
		 String resp= " ";
		 do 
	    {
	     
	   	    System.out.println("Enter height ");
            h1=scanner.nextInt();
            System.out.print("Enter weight");
            w= scanner.nextInt(); 
            ar1.add(new Cubeclass(h1,w));
            System.out.println("Continue?[Y/N]");
            scanner.nextLine();
        } while (scanner.nextLine().equalsIgnoreCase("y"));

	    m.getandarrangedData(ar1);
		
	    
	    ///////Another option:If not getting data from user///////////////////////
	       //Cubeclass c1=new Cubeclass(5,4);
	  		//Cubeclass c2=new Cubeclass(3,6);
	  		///Cubeclass c3=new Cubeclass(7,2);
	  	/*	ar1.add(c1);
	  		ar1.add(c2);
	  		ar1.add(c3);
	  		m.sort(ar1);
	  		m.getandarrangedData(ar1)*/
		
		
	}

}
