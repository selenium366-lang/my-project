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

/*
class Main {
    public static void main(String[] args) {
        int arr[] = {-8,-7,-5,-1};

        int largest = arr[0];
        int secondLargest = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest: " + secondLargest);
    }
}

//2nd largest
class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6, 5, 7, 2};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest Number: " + secondLargest);
    }
}

//3rd largest
class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6, 5, 7, 2};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third && arr[i] != first && arr[i] != second) {
                third = arr[i];
            }
        }

        System.out.println("3rd Largest Number: " + third);
    }
}


 */
}
