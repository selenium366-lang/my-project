package Z.Coding.Programs.String;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "madaam";
		boolean isPalindrome = true;

		for(int m=0; m<str.length()/2;m++) {
			if(str.charAt(m)!=str.charAt(str.length()-m-1)) {

				isPalindrome=false;
				break;
			}

		}
		if(isPalindrome)
			System.out.println("its palindrome");
			else
				System.out.println("not palindrome");
	}

}
