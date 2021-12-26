package superkeyword;

public class SuperConstructorImplementation1 extends SuperConstructor1 {
	
	SuperConstructorImplementation1(int c)
	{
		// super(); // JVM will give call to parent class
		super(15);
		System.out.println(" Child class parametersized constructor");
	}
	
	public static void main(String[] args) {
		
		SuperConstructorImplementation1 abc=new SuperConstructorImplementation1(50);
	}

}
