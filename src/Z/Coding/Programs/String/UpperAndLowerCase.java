package Z.Coding.Programs.String;

public class UpperAndLowerCase {
	public static void main(String[] args) {
        String text = "Hello World";

        // Convert to upper case
        String upperText = text.toUpperCase();

        // Convert to lower case
        String lowerText = text.toLowerCase();

        // Print results
        System.out.println("Original:  " + text);
        System.out.println("Uppercase: " + upperText);
        System.out.println("Lowercase: " + lowerText);
    }

}
