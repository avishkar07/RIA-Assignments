package Quetion05;

public class Demo {

	public static int Div ;
	int division(int dividend,int divisor)throws ArithmeticException {
		try {
		Div= dividend/divisor;
	
		}
		catch (ArithmeticException e) {
			System.out.println("Divisor cannot be zero");
		}
		return 0; 
	}
}
