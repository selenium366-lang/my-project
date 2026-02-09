package Z.Coding.Programs.String;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Selenium with java";
		String[] words = str.split(" ");
		String result = "";

		for(String word:words) {
			String revWord = "";

			for(int i=word.length()-1;i>=0;i--) {
				revWord = revWord+word.charAt(i);
			}
			result = result+revWord+" ";
		}

		System.out.println(result);

	}

}
