package Z.Coding.Programs.String;

public class MakeCapsOfFirstCharOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "quality assurance testing";
		
		StringBuilder result = new StringBuilder(); 
		
		for(String word:str.split(" ")) {
			result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
		}
	System.out.println(result.toString().trim());
	}
	

}
