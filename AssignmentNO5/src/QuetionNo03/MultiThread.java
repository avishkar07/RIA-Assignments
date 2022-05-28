package QuetionNo03;

import java.util.Scanner;

public class MultiThread extends Thread {
	// int numberOfIncrements;
	static int counter = 0;

	synchronized void inc() {

		for (int i = 1; i < 100; i++) {

			counter++;
		}

	}

	// MultiThread mt;
	public void run() {

		String threadName = Thread.currentThread().getName();
		this.inc();
		System.out.println(threadName);
		System.out.println(counter);
	}

	public static void main(String[] args) {
		MultiThread mt1 = new MultiThread();
		MultiThread mt2 = new MultiThread();
		mt1.start();
		try {
			mt1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mt2.start();
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the value: ");
		// int numberOfIncrements = sc.nextInt();

		//
		System.out.println(counter);
		// System.out.println(numberOfIncrements);
		//
	}
}