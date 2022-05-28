package Quetion05;

public class ThrowsDemo extends Demo {
public static void main(String[] args) {
	Demo demo = new Demo();
	
	try {
	demo.division(10, 0);	
	}catch (ArithmeticException e) {
		System.out.println("Exception Handale");
	}
	finally {
		System.out.println("The result is "+Div);
	}
}
}
