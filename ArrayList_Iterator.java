package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Iterator {

	public static void main(String[] args) 
	{
		ArrayList a1= new ArrayList();  	
		
		a1.add("Rajshree");					
		a1.add(22);                          
		a1.add(true);                        
		a1.add('c');						
		a1.add(77784326);
		a1.add(678432598);
		a1.add("jayshree");
		a1.add(null);
		System.out.println(a1);
		
		Iterator i= a1.iterator(); //using iterator method we can only iterate in forward direction using hasnext and next method
									//the same drawback can be overcome using list iterator
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
	}

}
