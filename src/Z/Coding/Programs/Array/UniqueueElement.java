package Z.Coding.Programs.Array;

import java.util.HashMap;
import java.util.Map;

public class UniqueueElement {
    public static void main(String[] args) {

        System.out.println("Unique elements using hashmap");
        int arr[] = {4,2,7,2,4,4,9,1,7};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for( Map.Entry<Integer,Integer> entry :map.entrySet()){  //<2,4>
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }


        System.out.println("Unique elements using for loop");

        for(int i=0; i<arr.length;i++){
            boolean isUnique = true;
            for( int j=0; j <arr.length;j++){
                if(i!=j && arr[i]==arr[j]){
                    isUnique =false;
                    break;
                }

            }
            if(isUnique){
                System.out.println(arr[i]);
            }

        }

}}
