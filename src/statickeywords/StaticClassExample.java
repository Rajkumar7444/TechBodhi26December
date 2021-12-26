package statickeywords;

public class StaticClassExample {
	
	static String abc = "hello alexa";
	String cde = "hello google";
	
	static class InnerClassStatic
	{
		static void print()
		{
			System.out.println(abc);
			//System.out.println(cde); // can not access the outer class non static
		}
		
		void method1()
		{
			System.out.println("method1");
		}
	}
	
	public static void main(String[] args) {
		StaticClassExample.InnerClassStatic.print();  // same as InnerClassStatic
		StaticClassExample.InnerClassStatic st1 = new StaticClassExample.InnerClassStatic();
		st1.method1();
		
		StaticClassExample st2 = new StaticClassExample();
		System.out.println(st2.cde);
	}

}
