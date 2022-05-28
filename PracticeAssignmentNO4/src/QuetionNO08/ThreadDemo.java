package QuetionNO08;

public class ThreadDemo extends Thread{

	@Override
	public void run() {
		for(int i = 0 ; i<5; i++) {
			System.out.println( "thread "+i);
			
			try {
				Thread.sleep(50);
			}
			catch(Exception e ) {
				System.out.println(e);
			}
		}
	}

	
	
}
