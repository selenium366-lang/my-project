package Y.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
	

public static void main (String[] args) {
		
		Map<Integer, String> m = new TreeMap<>();
		
		m.put(1,"java" );
		m.put(3,"python" );
		m.put(2, "C");
		m.put(4, "c#");
		
		m.put(2,"C++");		//re[lace value for key 2
		
		System.out.println("TreeMap soret in descending order");
		System.out.println(m);
		System.out.println(m.get(1));
		System.out.println(m.containsKey(3));
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		
		System.out.println("iterate over values");
		for(String val : m.values()) {
			System.out.println("value : " +val); 		// iterate over values
		}
		
		System.out.println("iterate over keys");
		for(Integer key : m.keySet()) {
			System.out.println("Key : " +key); 		// iterate over keys
		}
		
		System.out.println("iterate over keys value pair");
		for(HashMap.Entry<Integer, String> entry: m.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
		
		System.out.println("lambda");
		m.forEach((key,val)-> System.out.println("Key : "+key +" Value : "+ val));
	}


}
