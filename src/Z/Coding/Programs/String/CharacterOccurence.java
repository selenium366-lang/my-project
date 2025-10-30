package Z.Coding.Programs.String;

import java.util.LinkedHashMap;

public class CharacterOccurence {
	


    public static void main(String[] args) {
        String str = "xzswisseettt";  //w

       //char[] allCharacters =  str.toCharArray();// {'s','w',

        LinkedHashMap<Character,Integer> characterCount = new LinkedHashMap<>();

        for(char character :str.toCharArray()){
            characterCount.put(character,characterCount.getOrDefault(character,0)+1);
        }

        System.out.println("Character Occurances");
        System.out.println(characterCount);
        
        
        //Second duplicate character
        System.out.println("Second non duplicate Character");
          int counter =0;
        for(Character ch  :characterCount.keySet()){
            if(characterCount.get(ch)==1){ //make == as > will get 2nd duplicate char
                counter ++;
            }
            if(counter ==2){
                System.out.println( ch +":"+characterCount.get(ch));
                break;
            }
        }
        
        //1st non duplicate char
        System.out.println("1st non duplicate Character");
        for(Character ch  :characterCount.keySet()){
            if(characterCount.get(ch)==1){  ////make == as > will get 1nd duplicate char
            	System.out.println( ch +":"+characterCount.get(ch));
                break;
            }
        
    }
    }
}
