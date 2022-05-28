package Quetion01;
public class ShapeCircle {

	public static float Pi =3.14f;
	public static float Radius ;
	
	public ShapeCircle(float pi, float radius) {
		super();
		Pi = pi;
		Radius = radius;
	}
	
	public ShapeCircle(float radius) {
		
		Radius =radius;
	}
	
	public double CircleArea () {
		double Area =(Pi*Radius*Radius);
		System.out.println("Area of Circle :"+Area);
	return Area;
	}
	
	public double Circumference() {
	double circumference =(2*Pi*Radius*Radius);
	System.out.println("Circumference of circle :"+circumference);
	return circumference;
	}
	
	
	
	
}
