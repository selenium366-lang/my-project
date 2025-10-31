package Y.Set;

import java.util.HashSet;

public class HasSetEx {
	public static void main(String [] args) {

	HashSet<String> s = new HashSet<>();

	s.add("java");
	s.add(null);
	s.add("C");
	s.add("C++");
	s.add("java");	//ignore duplicate

	//insertion order not guaranted
	System.out.println(s);
	}


}
