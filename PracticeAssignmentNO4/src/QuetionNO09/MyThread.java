package QuetionNO09;


public class MyThread extends Thread{
	
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(currentThread().getName() +i);
		}
		try {
			Thread.yield();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
