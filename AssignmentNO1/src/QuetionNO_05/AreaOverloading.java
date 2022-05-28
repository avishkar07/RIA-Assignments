package QuetionNO_05;

public class AreaOverloading {

	public void area (int side) {
		 System.out.println("Area Of Square is "+ (side*side));
	}
	
	public void area(int lenght ,int breadth ) {
	System.out.println("Area of rectangle is :"+(lenght*breadth));	
	}
	
	
	public void area(int a,int b ,int c) {
		double s =(a+b+c)/2;
		System.out.println("Area of triangle is :"+Math.sqrt(s*(s-a)*(s-b)*(s-c)));
	}
	
	
	public static void main(String[] args) {
		AreaOverloading areaOverloading = new AreaOverloading();
		areaOverloading.area(11);
		areaOverloading.area(10,20);
		areaOverloading.area(10, 20, 20);
		
		
	}


}
