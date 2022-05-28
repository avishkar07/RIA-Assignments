package QuetionNO09;

public class MainClass {
public static void main(String[] args) {
	
	MyThread myThread =new MyThread();
	Thread t = Thread.currentThread();
	
	System.out.println(t.getName());
	myThread.start();
	myThread.setName("MyThread");
	System.out.println(	myThread.getName());
}
}
