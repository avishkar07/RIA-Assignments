package Quetion01;

public class Circle extends ShapeCircle{



	public Circle(float pi, float radius) {
		super(pi, radius);
		Pi =pi;
		Radius =radius;
	}

	public static void main(String[] args) {
		Circle circle = new Circle(3.14f, 12);
		System.out.println(Pi+","+Radius);
	}
}
