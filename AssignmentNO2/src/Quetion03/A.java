package Quetion03;

public class A extends Marks{

	 int English;
	 int Maths;
	 int Science;
	
	
	public A(int english, int maths, int science) {
		English = english;
		Maths = maths;
		Science = science;
	}
	
	@Override
	void getPercentage() {
		
		int sum =English +Maths+Science;
		int avg =sum/3;
		System.out.println("percentage of marks is "+avg);
	}

	
	
}
