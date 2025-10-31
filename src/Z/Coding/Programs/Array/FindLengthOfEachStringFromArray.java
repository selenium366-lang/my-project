package Z.Coding.Programs.Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindLengthOfEachStringFromArray {
	
	public static void main(String[] args) {
        List<String> words = Arrays.asList("SDET", "Java", "Streams");

        List<Integer> lengths = words.stream()
                                     .map(String::length)
                                     .collect(Collectors.toList());

        System.out.println("Word lengths: " + lengths);
    }

}
