package Z.Coding.Programs.Array;

public class SumOfAllNumbers {
	public static void main(String[] args) {

        int[] arr = {11,20,33,40,59,9};
        
        // find the sum of all numbers in an array
          int sum =0; //31

         for(int number:arr){
             sum = sum + number; // sum+=number
         }
         System.out.println("Sum of the numbers in an array: "+sum);
         
         
      // ==================================***********************===================
         // find the sum of all numbers in an array except 40

         int sumWithOut40 =0;
         for(int number:arr){

             if(number==40)
                 continue;  //skip below lines
             //if(number!=40)
             sumWithOut40 = sumWithOut40 + number; // sum+=number
         }

         System.out.println("sumWithOut40:"+sumWithOut40);
         
      
        
	}

}
