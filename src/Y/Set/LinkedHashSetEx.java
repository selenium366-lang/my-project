package Y.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {
	public static void main(String [] args) {
		
		HashSet<String> s = new LinkedHashSet<>();
		
		s.add("java");
		s.add(null);
		s.add("C");
		s.add("C++");
		s.add("java");	//ignore duplicate
		
		//insertion order guaranted
		System.out.println(s);
		}
		

}
