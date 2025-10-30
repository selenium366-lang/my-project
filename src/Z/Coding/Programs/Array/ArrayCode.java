package Z.Coding.Programs.Array;

import java.util.Arrays;

public class ArrayCode {
	
    public static void main(String[] args) {

        int[] arr = {11,20,33,40,59,9};
        //first
        System.out.println(arr[0]);
        //last
        System.out.println(arr[arr.length-1]);

        //print everything - normal for loop-------------------------------------->1st way
        System.out.println("//print everything - normal for loop ");
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //for each-------------------------------------------------------------->2nd way
        System.out.println("//print everything - normal for loop ");

        for(int number:arr){
            System.out.println(number);
        }

        // ==================================***********************===================
        System.out.println("numbers greater than 30");
        // which are greater than 30
        for(int number:arr){

            if(number>30)
                System.out.println(number);

        }

        // ==================================***********************===================
        System.out.println("printing in reverse order");
        // print array in reverse order
        for(int i = arr.length-1; i >=0;i--){
            System.out.println(arr[i]);
        }


        // ==================================***********************===================
        //missing number  -----------------> work for only 1 missing no.

        int[] arr2 = {1,2,3,4,6,7,8}; // 5

        int n =8;
        int sumOfFirst8Numbers =0;
        for(int m=1; m <=8;m++){
            sumOfFirst8Numbers = sumOfFirst8Numbers + m;
        }

        int sumOfNumbers = 0;
        for( int number: arr2){
            sumOfNumbers = number + sumOfNumbers;
        }
        System.out.println(sumOfFirst8Numbers-sumOfNumbers);
        
        // ==================================***********************===================
        //another logic
        System.out.println(((n*(n+1))/2)-sumOfNumbers);
        
    
    }


}
