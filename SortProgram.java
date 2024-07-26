package collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortProgram {

	public static void main(String[] args) 
	{
		//Sort-- it is actually Comparison of data (homogeneous data)
		
		ArrayList a1= new ArrayList();
		a1.add("Sushma");
		a1.add("Jayshree");
		a1.add("Vinita");
		a1.add("Vijay");
		a1.add("Ojal");
		a1.add("Aasha");
		a1.add("Seema");
		a1.add("Janhvi");
		
		Collections.sort(a1);   //using sort method of class collections
		
		
		System.out.println(a1);
	}

}
