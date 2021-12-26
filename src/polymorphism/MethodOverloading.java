package polymorphism;

public class MethodOverloading {

	public float add(int a, int b)
	{
		System.out.println(a+b);
	
	return a+b;
	}
	
	public float add(float a, float b, float c)
	{
		System.out.println(a+b+c);
		return a+b+c;
	}
	
	public float add(float a, float b)
	{
		System.out.println(a+b);
		return a+b;
	}
	public static void main(String[]args)
	{
		 MethodOverloading md = new  MethodOverloading();
		 md.add(15.5f, 40.8f);
		 md.add(15, 20);
		 md.add(18f, 22f);
		 
	}
}
