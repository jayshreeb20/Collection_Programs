package collection;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) 
	{
ArrayList a1= new ArrayList(6);  	
		
		a1.add("Rajshree");					
		a1.add(22);                          
		a1.add(true);                        
		a1.add('c');						
		a1.add(77784326);
		a1.add(678432598);
		a1.add("jayshree");
		a1.add(null);
		
		System.out.println(a1);
		
		//get method
		System.out.println("====getting element from the index no specified====");
		System.out.println(a1.get(3));
		
		//set method
		System.out.println("====updating element of the index no specified====");
		System.out.println(a1.set(0, "Tanish"));
		System.out.println(a1);
		
		//index of
		System.out.println(a1.indexOf("jayshree")); // getting index of element specified
	}

}
