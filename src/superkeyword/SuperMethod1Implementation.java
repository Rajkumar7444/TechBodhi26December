package superkeyword;

public class SuperMethod1Implementation extends SuperMethod1 {
	
	void Display()
	{
		System.out.println("Super/Child method");
	}

	void Print()
	{
		System.out.println(" This is the Timepass");
		Display();
		super.Display();
	}
	
	public static void main(String[] args) {
		
		SuperMethod1Implementation abc=new SuperMethod1Implementation();
		abc.Print();
	}
}
