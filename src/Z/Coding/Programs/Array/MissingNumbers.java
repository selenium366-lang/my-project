package Z.Coding.Programs.Array;

public class MissingNumbers {
	public static void main(String[] args) {
		boolean found ;
	
	int[] arr = {1,2,4,5,7,8,9,10};
    for (int i=1 ; i<=10; i++) {
    	 found = false;
    	
    	for(int j : arr) {
    		if(i==j) {
    			found = true;
    			break;
    		}
    	}
    	if(found == false)
    		System.out.println(i);
    }
    

}
}
