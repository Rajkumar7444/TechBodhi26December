package polymorphism;

public class MethodOverRiding1Implementation extends MethodOverRiding1{

	int speedlimit = 150; //over riding can not achived on data mrmber
	void abc()
	{
		System.out.println("extended class");
	}
void cde()
{
	System.out.println(speedlimit);
System.out.println(super.speedlimit);
}

public static void main(String[]args)
{
	MethodOverRiding1 mr = new MethodOverRiding1Implementation();
	System.out.println(mr.speedlimit);
	mr.abc();
	
	MethodOverRiding1Implementation mr1 = new MethodOverRiding1Implementation();
	System.out.println(mr1.speedlimit);
	mr1.abc();
}
}
