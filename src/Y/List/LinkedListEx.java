package Y.List;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(2);
		list.add(5);
		list.add(1);
		list.add(3);
		
		System.out.println(list);
		System.out.println(list.getLast());
		System.out.println(list.get(0) );

	}

}
