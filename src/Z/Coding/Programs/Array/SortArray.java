package Z.Coding.Programs.Array;

import java.util.Arrays;

public class SortArray {
	public static void main (String [] args) {
		
		int[] arr = {50,7,8,9,10};
		
		for(int i=0; i<arr.length-1;i++) {
			
			for (int j=0;j<arr.length-1;j++) { // alternate way :  int j=0;j<arr.length-i-1;j++
				
				if(arr[j]>arr[j+1]) { //if want descending order : arr[j]>arr[j+1]
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
