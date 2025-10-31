package Z.Coding.Programs.String;

public class UpperAndLowerCaseUsingLoop {
	
	    public static void main(String[] args) {
	        String text = "Hello World!";
	        String upperText = "";
	        String lowerText = "";

	        // Loop through each character
	        for (int i = 0; i < text.length(); i++) {
	            char ch = text.charAt(i);

	            // Convert to uppercase manually
	            if (ch >= 'a' && ch <= 'z') {
	                upperText += (char) (ch - 32); // 'a' to 'A', 'b' to 'B', etc.
	            } else {
	                upperText += ch; // keep as-is (spaces, punctuation, etc.)
	            }

	            // Convert to lowercase manually
	            if (ch >= 'A' && ch <= 'Z') {
	                lowerText += (char) (ch + 32); // 'A' to 'a', 'B' to 'b', etc.
	            } else {
	                lowerText += ch;
	            }
	        }

	        System.out.println("Original:  " + text);
	        System.out.println("Uppercase: " + upperText);
	        System.out.println("Lowercase: " + lowerText);
	    }
	


}
