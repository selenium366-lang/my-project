package Y.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String [] args) {
		// TODO Auto-generated method stub
		Set<Integer> s = new TreeSet<>();
		s.add(50);
		//s.add(null);	//null not allowed
		s.add(10);
		s.add(60);
		s.add(5);
		s.add(30);
		
		//store element in descending order
		System.out.println(s);
		

	}

}
