package exeptionhandling;

public class ThrowException {
	
	public static void validate(int age) {
		
		if(age<18)
		{
			
			// throw Arithmetic exception if not eligible to vote
			throw new ArithmeticException("Person is not eligible to vote");
		}
		
		else {
			
			System.out.println("Person is eligible to vote !");
		}
	}

	public static void main(String[] args) {
		// Calling the Person
		
		validate(22);
		System.out.println("rest of the code...");
	}
}
