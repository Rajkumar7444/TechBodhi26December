package thiskeyword;

public class ThisKeywordExample2 {
	
	void method1()
	{
		System.out.println("Hello boy");
	}
	
	void method2()
	{
		System.out.println("Hello girl");
		this.method1();
		method1(); // this is run same as this.method1
	}
	
	public static void main(String[] args) {
		
		ThisKeywordExample2 abcd= new ThisKeywordExample2();
		ThisKeywordExample2 xyz= new ThisKeywordExample2();
		
		abcd.method1();
		xyz.method2();
	}

}
