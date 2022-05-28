package QuetionNO01;

public class A extends Thread {
public void run()
{
System.out.println("Thread A");
for(int i=1;i<=5;i++)
{
System.out.println("i = " + i);
try {
Thread.sleep(1000);
} catch (Exception e) {
// TODO Auto-generated catch block
System.out.println(e);
}
}
System.out.println("Thread A Completed."); 
}
}
