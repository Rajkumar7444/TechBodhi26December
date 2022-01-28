package abastractionexample;

public class AbstractClass1Implimentation extends AbsractClass1

{

	public void Abstractmethod1() {
		// TODO Auto-generated method stub
		
		System.out.println("abstract method 1 implementation");
	}
		public static void main(String[]args) {
			// AbstractClass1 ab = new AbstractClass1(); // can not creat the instance
			
			 AbsractClass1 ab1 = new AbstractClass1Implimentation();
			 ab1.abstractmethod1();
			 ab1.simplemethod();
			 
			 AbstractClass1Implimentation abc = new AbstractClass1Implimentation();
			 abc.abstractmethod1();
			 abc.simplemethod();
	}
		@Override
		public void abstractmethod1() {
			// TODO Auto-generated method stub
			
		}
			
		
	
	

}
