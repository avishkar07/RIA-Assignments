package QuetionNO_06;

public class ConstructorDemo {

	int id ;
	String name ;
	
	public ConstructorDemo(int a, String b) {
		this.id = a;
		this.name = b;
	}

	
	public ConstructorDemo(ConstructorDemo constructorDemo) {
		id =constructorDemo.id;
		name = constructorDemo.name;
		
	}
	
	public void display() {
		System.out.println(id+","+name);
	}
	public static void main(String[] args) {
		ConstructorDemo constructorDemo= new ConstructorDemo(1,"avishkar");
		ConstructorDemo constructorDemo2 =new ConstructorDemo(constructorDemo);
		constructorDemo.display();
		constructorDemo2.display();
		
	}

}
