package collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMethodsProgram {

	public static void main(String[] args) 
	{
LinkedList l1= new LinkedList();
		
		l1.add(20);
		l1.add(87);
		l1.add(56);
		l1.add(56);
		l1.add(16);
		
		System.out.println(l1);
		
		System.out.println("<====Adding element to the first position====>");
		
		//add first - this method will add element to the beginning of the list		
		l1.addFirst("JAYSHREE");
		System.out.println(l1);
		
		System.out.println("<====Adding element to the last position====>");
		//add Last - this method will add element to the end of the list
		l1.addLast("BARDE");
		System.out.println(l1);
		
		//get first
		System.out.println("<====Fetching element from first position====>");
		System.out.println(l1.getFirst());
		
		//get last
		System.out.println("<====Fetching element from Last position====>");
		System.out.println(l1.getLast());
		
		//remove first
		System.out.println("<====removing element from first position====>");
		System.out.println(l1.removeFirst());
		System.out.println(l1);
		
		
		//remove last
		System.out.println("<====removinging element from last position====>");
		System.out.println(l1.removeLast());
		System.out.println(l1);
		
		//Poll First
		System.out.println("<====Polling first element from the list====>");
		System.out.println(l1.pollFirst());
		
		//Poll Last
		System.out.println("<====Polling Last element from the list====>");
		System.out.println(l1.pollLast());
		
		
		
	}

}
