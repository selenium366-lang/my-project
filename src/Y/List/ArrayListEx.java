package Y.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>(); 
		
		list.add("Apple");
		list.add("Orange");
		list.add("Mango");
		
		list.add(2, "Grapes");				// adding 
		
		System.out.println(list);			//Printing
		
		System.out.println("Accessing 3rd " + list.get(3));	//accessing
		
		list.set(3, "Pineapple");			//updating
		System.out.println("After updating 3rd " + list);
		
		list.remove("Pineapple");			//remove
		System.out.println("After removing Pineapple " + list);
		
		System.out.println("Size of arraylist : " + list.size());	//Size
		
		//printing with different ways
		System.out.println(list);			//printing in list
		
		System.out.println("printing using for each");	
		for (String fruit : list)			//printing using for each
			System.out.println(fruit);
		
		System.out.println("Print using iterator");		//Print using iterator
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("Print using list iterator");		//Print using list iterator
		ListIterator<String> itr1 = list.listIterator();
		while(itr1.hasNext())
			System.out.println(itr1.next());
		
//		while(itr1.hasPrevious()) {
//			System.out.println(itr1.previous());
//		}
		
		System.out.println("Print using lambda");
		list.forEach(fruit -> System.out.println(fruit));		//Print using lambda
		

	}

}
