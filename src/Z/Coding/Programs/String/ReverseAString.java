package Z.Coding.Programs.String;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ABC";
		String rev = "";
		for(int i= str.length()-1; i>=0;i--) {
			rev = rev + str.charAt(i);}
			System.out.print(rev);
			
			System.out.println("Using string builder");
			System.out.println(new StringBuilder(str).reverse().toString());
	}

}
