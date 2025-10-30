package Z.Coding.Programs.Array;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class FindSecondLargestNumber {
	
	 public static void main(String[] args) {


	        int arr[] = {4, 2, 7, 4, 4, 9, 1, 7};

	        HashMap<Integer, Integer> map = new HashMap<>();
	        for (int num : arr) {
	            map.put(num, map.getOrDefault(num, 0) + 1);
	        }

	        TreeSet<Integer> allValues = new TreeSet<>(Collections.reverseOrder());
	        allValues.addAll(map.values());
	        int secondLargestValue = allValues.higher(allValues.first());

	        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {  //<2,4>
	            if (entry.getValue() == secondLargestValue) {
	                System.out.println(entry.getKey() + ":"+ entry.getValue());
	            }


	        }
	    }


}
