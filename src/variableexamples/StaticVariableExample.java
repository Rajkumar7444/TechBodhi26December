package variableexamples;

public class StaticVariableExample {
	
	int RollNumber;
	String Name;
	
	static String CollegeName="Raisoni";
	
	StaticVariableExample(int R,String N)
	{
		RollNumber=R;
		Name=N;
	}

	void Toprint()
	{
		System.out.println(RollNumber);
		System.out.println(Name);
		System.out.println(CollegeName);
	}
	
	public static void main(String args[])
	{
		
		StaticVariableExample Raj=new StaticVariableExample(1405, "Avinash");
		StaticVariableExample Patil=new StaticVariableExample(1520,"Jeet");
		
		Raj.Toprint();
		Patil.Toprint();
		
	}
}
