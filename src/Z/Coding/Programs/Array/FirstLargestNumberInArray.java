package Z.Coding.Programs.Array;

public class FirstLargestNumberInArray {
	public static void main(String[] args){
		
		int[] arr = {4,50,7,8,9,10};
		
		int max = arr[0];
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			
		}
		System.out.println(max);
	}

}
