package Z.Coding.Programs.Array;

public class FindDuplicateUsingLogicalLoop {

	public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        int[] arr = {4,2,1,4,7,4,8,2};

        boolean[] visited = new boolean[arr.length];

        //{false,true,true,true,true,false,true,false}

        for( int i=0; i<arr.length;i++){ //i=4
            if(visited[i])
            continue;

            boolean isDuplicate =false;
            for(int j=i+1;j<arr.length;j++){  //j=4,
                if(arr[i]==arr[j]){  //arr[3] ==arr[4]    2 ==2
                    isDuplicate=true;
                    visited[j]=true;

                }
            }

            if(isDuplicate){
                System.out.println(arr[i]); //4
            }

        }


    }


}
