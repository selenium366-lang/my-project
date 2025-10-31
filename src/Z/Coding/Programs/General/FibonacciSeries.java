package Z.Coding.Programs.General;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int f1 = 0;
		int f2 = 1;

		for(int i=2; i<20; i++) {
		int f3=f1+f2;
		System.out.print(" "+f3);
		f1=f2;
		f2=f3;
	}
	}

}
