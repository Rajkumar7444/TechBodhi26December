package variableexamples;

public class LocalVariableExample {
	
	public void method1()
	{
		String LocalVariable= "this is local variable";  //this is local variable as it is inside the method
				
				//access modifier can not be assign for local variable
				//public String abc1= "access modifier can not be assign for local variable";
				
				//static can not be used for local variable
				//static String cde= "static can not be used for local variable";
				
				//value should be assign before first use of local variable
				//String NoAssignValue
				//System.out.println("NoAssignValue");
		
		System.out.println(LocalVariable);
	}

	public static void main(String args[])
	{
		LocalVariableExample raj= new LocalVariableExample();
		raj.method1();
	}
}
