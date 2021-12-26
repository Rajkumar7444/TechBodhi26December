package superkeyword;

public class SuperVariableImplementation1 extends SuperVariable1 {
	
	String xyz = " I am in a Child/Super class";
	
	void Display()
	{
		System.out.println(xyz);
		System.out.println(super.xyz);
	}

	public static void main(String[] args) {
		SuperVariableImplementation1 abc= new SuperVariableImplementation1();
		
		abc.Display();
	}
}
