package statickeywords;

public class StaticMethodExample {
	
	int a = 10;
	static int b = 20;
	
	static void abc()
	{
		// system.out.println(a); // static method can not access non static method
		System.out.println(b);
	}
	
	void cde() // non static method can access both static and nod non static variable
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		// System.out.println(a); // can not access as main method is also static
		StaticMethodExample xyz=new StaticMethodExample();
		System.out.println(xyz.a);
		System.out.println(b);
		
		StaticMethodExample.abc();
		//cde(); // not posible as cde is not static method
		xyz.cde();
	}

}
