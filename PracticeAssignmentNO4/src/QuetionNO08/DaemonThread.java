package QuetionNO08;

public class DaemonThread {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName() +"Start");
		ThreadDemo threadDemo =new ThreadDemo();
		threadDemo.setName("t1");
		threadDemo.setDaemon(true);
		if(threadDemo.isDaemon()) {
			System.out.println("thread is Daemon Thread");
		}
		threadDemo.start();
		System.out.println(Thread.currentThread().getName() +"End");
	}

}
