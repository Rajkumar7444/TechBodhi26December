package abastractionexample;

public class PolicyBazar {

	public static void main(String []args) {
		
		Rbi sb = new Sbi();
		sb.rateofintrest();
		
		Rbi hd = new Hdfc();
		hd.rateofintrest();
		
	Rbi bo = new Boi();
	bo.rateofintrest();
	}
}
