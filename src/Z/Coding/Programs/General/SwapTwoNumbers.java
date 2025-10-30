package Z.Coding.Programs.General;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		int b = 2;
		System.out.println("Before swaping a = "+a + " b= "+b);
		
		int temp =a;
		a=b;
		b=temp;
		System.out.println("After swaping a = "+a + " b= "+b);
		
		//Another way
		int x=3;
		int y=4;
		System.out.println("Before swaping x = "+x + " y= "+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swaping x = "+x + " y= "+y);
		
		
	}

}
