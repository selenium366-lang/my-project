package Z.Coding.Programs.General;

import java.util.LinkedHashMap;
import java.util.Map;

public class ShrinkingOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabbbccccddddd";
		Map<Character, Integer> hashmap = new LinkedHashMap<>();
		
		for(char c  : str.toCharArray()) {
			hashmap.put(c, hashmap.getOrDefault(c, 0)+1);
		}
		for(Character key: hashmap.keySet()) {
			System.out.println(key.toString()+hashmap.get(key));
		}
	}

}
