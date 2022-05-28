package Quetion04;

public class Test {
	
	public static void main(String[] args) {
		RBI rbi = new  RBI();
		System.out.println("RBI Interest :"+rbi.getInterestRate());
		
		SBI sbi =new SBI();
		System.out.println("SBI INterest :"+sbi.getInterestRate());
		
		ICICI icici =new ICICI();
		System.out.println("ICICI Interest :"+icici.getInterestRate());
		
		AXIS axis = new AXIS();
		System.out.println("AXIS Interest :"+axis.getInterestRate());
	}
}
