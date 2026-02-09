package Z.Coding.Programs.Array;

import java.util.Arrays;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {

        int[] arr = {11,20,33,40,59,9};
     // ==================================***********************===================
        // find the largest and smallest in an array

        int largest = arr[0]; //33
        int smallest = arr[0]; //11

        for( int number :arr ){
            if( number > largest )
                largest = number;
            else if( number < smallest)
                smallest =number;
        }
        System.out.println("largest:"+ largest+ " smallest:"+smallest);

//        for( int k=1 ; i < arr.length; i++){
//
//            if( arr[k] > largest )
//                largest = arr[k];
//            else if( arr[k] < smallest)
//                smallest =arr[k];
//
//        }
        // largest number : and smallest number :
        System.out.println("largest:"+ largest+ " smallest:"+smallest);

        // ==================================***********************===================
        //sort

        Arrays.sort(arr);
        System.out.println("this is printing by using Arrays utility class");
        System.out.println("samllest:"+ arr[0]+ " largest:"+arr[arr.length-1]);
	}

}
