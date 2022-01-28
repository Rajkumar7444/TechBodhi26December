package thiskeyword;

public class ThisKeywordExample3 {
	
	ThisKeywordExample3()
	{
		this(8);
		System.out.println("Default Constructor");
		
	}
	
	ThisKeywordExample3(int a)
	{
		//this();
		System.out.println(a);
	}

	public static void main(String[] args) {
		ThisKeywordExample3 ab=new ThisKeywordExample3();
	}
}
