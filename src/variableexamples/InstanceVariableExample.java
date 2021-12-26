package variableexamples;

public class InstanceVariableExample {
	
	public String Raj;
	public int Jeet;
	
	public void method1(String abc)
	{
		Raj=abc;
	}

	public void method2(int efg)
	{
		Jeet=efg;
	}
	
	public void method3()
	{
		System.out.println(Raj);
		System.out.println(Jeet);
		}
	
	public static void main(String args[])
	{
		InstanceVariableExample Patil= new InstanceVariableExample();
		Patil.method1("Rajkumar");
		Patil.method2(15231);
		Patil.method3();
		
	}
}
