package Z.Coding.Programs.Array;

public class OddEvenNumbers {
	public static void main(String[] args) {

        int[] arr = {11,20,33,40,59,9};
        
        System.out.println("printing even numbers and odd numbers ");

        for(int number:arr){

            if(number%2==0)
                System.out.println("this is even number :"+number);
            else
                System.out.println("this is odd number :"+number);

        }
        
     // ==================================***********************===================
        System.out.println("printing using while loop");
        int i=0;
        while(i<arr.length){
            if(arr[i]%2==0)
            System.out.println("this is even"+arr[i]);
            else
                System.out.println("this is odd"+arr[i]);
            i++;
        }

        // ==================================***********************===================
        //do while loop
        System.out.println("printing using Do while loop");
        int j=0;

        do{
            if(arr[j]%2==0)
                System.out.println("this is even"+arr[j]);
            else
                System.out.println("this is odd"+arr[j]);
            j++;
        }while(j<arr.length);
        
	}

}
