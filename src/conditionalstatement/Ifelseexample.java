package conditionalstatement;

import java.util.Scanner;

public class Ifelseexample {

	private static Scanner sc;

	public static void main (String[] args) {
		// its use for take output from user
		
		sc = new Scanner(System.in);
		System.out.println("please enter a number");
		
		int number=sc.nextInt();
		
		if(number%2==0) {
			System.out.println("even number");
		}else {
			System.out.println("odd number");
		}
	}
}
