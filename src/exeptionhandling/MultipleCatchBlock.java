package exeptionhandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		
		try {
			int a[]=new int[5];
			a[9]=30/0;
			System.out.println("try block");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("task is completed");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("task 2 completed");
		}
		
		catch(Exception e)
		{
			System.out.println("common task completed");
		}
		
		finally 
		{
			System.out.println("this code will always executed");
		}
	}
}
