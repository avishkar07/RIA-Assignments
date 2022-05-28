package QuetionNO01;

public class Main {
	
	public static void main(String[] args) {
		
		//life cycle of Thread
		// Thread's New 
		A threadA = new A();
		B threadB = new B();
	
		
		//Running state of thread A & B		
		threadA.start();
		

		threadA.yield();
	
		try {		
			threadA.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		threadB.start();		
		System.out.println("Main Thread End");
	}
}