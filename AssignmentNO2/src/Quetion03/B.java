package Quetion03;

public class B extends Marks{


	int English;
	int Maths;
	int Science;
	int Hindi;
	public B(int english, int maths, int science, int hindi) {
		super();
		English = english;
		Maths = maths;
		Science = science;
		Hindi = hindi;
	}
	
void getPercentage() {
		
		int sum =English +Maths+Science+Hindi;
		int avg =sum/4;
		System.out.println("percentage of marks is "+avg);
	}

}
