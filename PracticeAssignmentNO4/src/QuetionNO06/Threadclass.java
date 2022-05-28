package QuetionNO06;


public class Threadclass extends Thread {

	@Override
	public void run() {
		System.out.println("Thread Class 1 ");
		for (int i = 0; i < 5; i++) {
			System.out.println(currentThread().getName() + i);
		}
	}
}

class Threadclass1 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread class 2");

		for (int i = 0; i < 5; i++) {
			System.out.println("thread 2 :" + i);
		}
	}

}

class Main {
	public static void main(String[] args) {
		Threadclass threadclass = new Threadclass();
		Threadclass1 threadclass1 = new Threadclass1();
		threadclass.setPriority(6);
		threadclass1.setPriority(10);
		threadclass.start();
		threadclass1.start();
		System.out.println("priority of thread 1 :"+threadclass.getPriority());
		System.out.println("priority of thread 2 :"+threadclass1.getPriority());

	}
}
