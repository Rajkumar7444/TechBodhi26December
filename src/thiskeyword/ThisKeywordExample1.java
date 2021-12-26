package thiskeyword;

public class ThisKeywordExample1 {
	
	int rollno;
	String name;
	float fees;
	
	ThisKeywordExample1(int rollno,String name,float fees)
	{
		this.rollno=rollno; //change now to this.rollno=rollno
		this.name=name; // change to this.name
		this.fees=fees; // change to this.fees
		
	}
	
	void Display()
	{
		System.out.println(rollno+" "+name+" "+fees);
		
	}
	
	public static void main(String[] args) {
		ThisKeywordExample1 ab1 = new ThisKeywordExample1(1220,"Rajkumar",153.54f);
		ThisKeywordExample1 ab2 = new ThisKeywordExample1(1458,"Jeet",1478.68f);
		ab1.Display();
		ab2.Display();
		
	}

}
