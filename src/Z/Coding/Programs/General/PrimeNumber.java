package Z.Coding.Programs.General;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 18;
		boolean isPrime = true;
		
		for(int i=2; i<n; i++) {
			
			if(n%i==0) {
				isPrime=false;
			}
		}
		if(isPrime)
			System.out.println("prime");
		else
			System.out.println("Not prime");
	}

}
