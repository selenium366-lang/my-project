package X.Exception.UnChecked;

public class UnCheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			int result = 10 / 0;              // ArithmeticException (unchecked)
			
			int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);	  // ArrayIndexOutOfBoundsException
            
            String abc = null;
            System.out.println(abc.length());         //NullPointerException
			
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
	}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
	}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
	
		finally{ 
			System.out.println("Finally block");
		}

	}

}
