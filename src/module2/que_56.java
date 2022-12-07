package module2;

import java.util.ArrayList;
import java.util.List;

public class que_56 {
	public static void main(String args[])  
	{  
	//first array list  
	ArrayList<String> firstList=new ArrayList<String>();  
	 
	firstList.add("Apple");  
	firstList.add("Pears");  
	firstList.add("Guava");  
	firstList.add("Mango");  
	System.out.println(firstList);  
	//second array list      
	List<String> secondList=new ArrayList<String>();  
	 
	secondList.add("Apple");  
	secondList.add("Pears");  
	secondList.add("Guava");  
	secondList.add("Mango");  
	System.out.println(secondList);  
	//comparing both lists  
	boolean boolval = firstList.equals(secondList);  
	System.out.println(boolval);  
	 
	secondList.add("Papaya");  
	  
	boolean bool = firstList.equals(secondList);   
	System.out.println(bool);  
	}
}
