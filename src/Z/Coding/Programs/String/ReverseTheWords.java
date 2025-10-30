package Z.Coding.Programs.String;

public class ReverseTheWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello World";
		String rev = "";
		
		for(String word:str.split(" ")) {
			rev = word+" "+ rev;
		}
		System.out.println(str+" "+ rev);
	}

}
