package abastractionexample;

public class InterFaceImplimentation implements interface1 {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("method1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method2");
	}

	public static void main(String[]args) {
		
		System.out.println(a);
		interface1 if1 = new InterFaceImplimentation();
		if1.method1();
		if1.method2();
	}
}
