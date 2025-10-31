package Z.Coding.Programs.General;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 12231;
		int rev = 0;
		int originalno = num;
		while(num!=0) {
			rev = rev*10+num%10;
			num = num/10;
		}
		System.out.println(rev);
	if(originalno==rev) {
		System.out.println("palindrome");
	}
	else
		System.out.println("not palindrome");
	}

}
