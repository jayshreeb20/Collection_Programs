package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListProgramForIterator {

	public static void main(String[] args) 
	{
LinkedList l1= new LinkedList();
		
		l1.add(20);
		l1.add(87);
		l1.add(56);
		l1.add(56);
		l1.add(16);
		
		Iterator i2= l1.iterator();
		
		System.out.println("===========Forward direction Iteration============");
		
		while (i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
	}

}
