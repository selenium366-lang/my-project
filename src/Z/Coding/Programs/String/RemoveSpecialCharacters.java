package Z.Coding.Programs.String;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ABC@4$1252627DEF*76";

		//Remove special characters
		System.out.println(str.replaceAll("[^a-zA-z0-9]", ""));

		//Only alphabets
		System.out.println(str.replaceAll("[^a-zA-z]", ""));

		String str1 = "This@ is& java lang";
		System.out.println(str1.replaceAll("[^a-zA-z\\s]", ""));

		String str2 = "This is java lang";
		System.out.println(str2.replaceAll("\\s", ""));

		String str3 = "This    is     java    lang";
		System.out.println(str2.replaceAll("\\s", " "));

	}

}
