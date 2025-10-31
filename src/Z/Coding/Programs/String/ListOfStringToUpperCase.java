package Z.Coding.Programs.String;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringToUpperCase {
	public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "python", "selenium");

        List<String> upperNames = names.stream()
                                       .map(String::toUpperCase)
                                       .collect(Collectors.toList());

        System.out.println("Uppercase: " + upperNames);
    }

}
