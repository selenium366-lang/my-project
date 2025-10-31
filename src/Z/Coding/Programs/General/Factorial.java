package Z.Coding.Programs.General;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =7;
		int factorial = 1;
		for(int i=1; i<=7; i++) {
			factorial = factorial * i;
			System.out.println(factorial);
		}

//		Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a non-negative integer: ");
//        int number = scanner.nextInt();
//
//        if (number < 0) {
//            System.out.println("Factorial is not defined for negative numbers.");
//        } else {
//            long factorial = 1; // Use long to handle larger factorials
//            for (int i = 1; i <= number; i++) {
//                factorial *= i;
//            }
//            System.out.println("Factorial of " + number + " is: " + factorial);
//        }
//        scanner.close();
//    }


	}}

