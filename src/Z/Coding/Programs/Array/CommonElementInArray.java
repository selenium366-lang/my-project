package Z.Coding.Programs.Array;

public class CommonElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {1,2,3,4};
		int[] arr2 = {3,4,5,6};

		for (int element : arr1) {
			for (int element2 : arr2) {

			if(element==element2) {
			System.out.println(element);
			break;
			}
		}
	}
	}
}
