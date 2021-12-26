package constructorexamples;

public class ParameterizedConstructorExample {
	
	int rollnumber;
	String name;
	
	public void display()
	{
		rollnumber=155;
		name="Abhijeet";
		
		System.out.println(rollnumber);
		System.out.println(name);
	}
	
	public void show()
	{
		rollnumber=154;
		name="Amar";
		
		System.out.println(rollnumber);
		System.out.println(name);
		
	}

	public static void main(String args[])
	{
		ParameterizedConstructorExample abc=  new ParameterizedConstructorExample();
		ParameterizedConstructorExample xyz= new ParameterizedConstructorExample();
		
	abc.show();
	xyz.display();
	
	}
}
