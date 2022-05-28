package QuetionNO05;

import QuetionNO04.Threadclass;

public class RunnableInterface implements  Runnable{

	@Override
	public void run() {
		System.out.println("Thread 1 start:");
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread 2 :"+i);
		}
		System.out.println("Thread 2 End ");
	}
	
}

class Thread2 implements Runnable {
	public void run() {
		System.out.println("thread 2 start :");
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread 1 :"+i);
		}
		System.out.println("Thread 2 End ");
	}
}

class Thread3 implements Runnable {
	public void run() {
		System.out.println("thread 3 start :");
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread 3 :"+i);
		}
		System.out.println("Thread 3 End ");
	}
}


class Main {
	public static void main(String[] args) {
		
		RunnableInterface runnableInterface = new RunnableInterface();
		Thread thread = new Thread(runnableInterface);
		
		Thread2 thread2 = new Thread2();
		Thread thread3 = new Thread(thread2);
		
		Thread3 thread4 = new Thread3();
		Thread thread5 = new Thread(thread4);
		
		thread.start();
		thread3.start();
		thread5.start();
	}
	
}


