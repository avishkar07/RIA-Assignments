package QuetionNO_10;

public class Rectangle {
	
	public int length ;
	public int breadth ;

	public Rectangle() {
		System.out.println("defalt constructer");
	}
	
	public Rectangle(int a, int b) {
		System.out.println("two parameters Constructer ");
		this.length = a;
		this.breadth = b;
	}

	public Rectangle(int a) {
		System.out.println("one parameters Constructer ");
		this.length=a;
		this.breadth=a;
	}

	public int calculate(int length ,int breadth) {
		int area = length*breadth;
		System.out.println(area);
		return area;
	}
	public void display() {
		System.out.println(length+","+breadth);
	}
	public static void main(String[] args) {
    Rectangle rectangle =new Rectangle();
    rectangle.display();
    Rectangle rectangle2=new Rectangle(12,15);
    rectangle2.display();
    Rectangle rectangle3 =new Rectangle(12);
    rectangle3.display();
    rectangle.calculate(12, 15);
	}

}
