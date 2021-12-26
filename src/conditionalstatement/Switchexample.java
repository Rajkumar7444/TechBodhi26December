package conditionalstatement;

public class Switchexample {
	
	public static void main (String[] args) {
		
		int num=100;
				switch(num) {
				
				case 100:
					System.out.println("value of case 1 is "+num);
					
			// need to use break else it will go to the next condition is well
					//break;
					
				case 200:
				System.out.println("value of case 2 is "+num);
				//break;
				
				default:
				System.out.println("value of default is "+num);
				}
	}
	
// input:- My name is Rajkumar Patil, Output:- Patil Rajkumar is my name
	// Prime number
}
