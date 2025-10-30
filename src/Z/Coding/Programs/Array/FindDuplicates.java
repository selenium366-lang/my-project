package Z.Coding.Programs.Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class FindDuplicates {
	
    public static void main(String[] args) {
    	
    	int arr[] = {4,2,7,2,4,4,9,1,7};

         System.out.println("find duplicates using any HashMap");
         HashMap<Integer,Integer> DuplicateHashMap = new LinkedHashMap<>();
         for( int number : arr) {
             //DuplicateHashMap.put(number, DuplicateHashMap.getOrDefault(number, 0)+1);

           if(DuplicateHashMap.containsKey(number)) {
               DuplicateHashMap.put(number, DuplicateHashMap.get(number) + 1);
           }
           else
               DuplicateHashMap.put(number,1);
         }

         System.out.println("Printing duplicates using hashmap");
         for(int key :DuplicateHashMap.keySet()){
             if(DuplicateHashMap.get(key) >1){
                 System.out.println(key);
             }
         }

         System.out.println("Printing unquie using hashmap");
         for(int key :DuplicateHashMap.keySet()){
             if(DuplicateHashMap.get(key) == 1){
                 System.out.println(key);
             }
         }


         System.out.println("Printing numbers and their occurances using HashMap");
         for(int key :DuplicateHashMap.keySet()){
             System.out.println( "["+key +" - "+DuplicateHashMap.get(key)+"]");
         }


         System.out.println("Printing first duplicate using hashmap");
         for(int key :DuplicateHashMap.keySet()){
             if(DuplicateHashMap.get(key) > 1){   //2
                 System.out.println(key);
                 break;
             }
         }

    	
    
    }

}
