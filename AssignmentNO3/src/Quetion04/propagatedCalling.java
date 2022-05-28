package Quetion04;

public class propagatedCalling {
		int a;
	void m () {
		System.out.println("M method");
		 a= 10/0;
	
	}
	
	void n () {
		System.out.println(" N method");
		m();
	}
	
	void test() {
		
		try {
			n();
		}
		catch(Exception e) {
			System.out.println("Exception Occure in n Method");
		}
	}
	
	public static void main(String[] args) {
		
		propagatedCalling propagatedCalling =new propagatedCalling();
		propagatedCalling.test();
		System.out.println("main method");
	}
}
