package Z.Coding.Programs.Array;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {1,2,3,4};
		int[] arr2 = {5,6,7,8};
		
		int[] result = new int[arr1.length + arr2.length];
		
		for(int i=0; i<arr1.length; i++) {
			result[i] = arr1[i];
		}
		
		for(int j=0; j<arr2.length; j++) {
			result[arr1.length+j] = arr2[j];
		}
		
		System.out.println("result arrays" + Arrays.toString(result));
	}

}
