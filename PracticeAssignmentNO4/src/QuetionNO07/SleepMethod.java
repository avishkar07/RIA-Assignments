package QuetionNO07;

public class SleepMethod extends Thread {
	@Override
		public void run() {
		System.out.println("Thread 1");
		for (int i = 0; i < 5; i++) {
			System.out.println("thread 1 :"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
}
	class SleepMethod1 extends Thread{
		@Override
		public void run() {
		System.out.println("Thread 2");
		for (int i = 0; i < 5; i++) {
			System.out.println("thread 2 :"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}
		class main{
			public static void main(String[] args) {
				SleepMethod sleepMethod =new SleepMethod() ;
				SleepMethod1 sleepMethod1 = new SleepMethod1();
				sleepMethod.start();
				sleepMethod1.start();
				
			}
		}


