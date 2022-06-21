package Composition;
public class Test {
	public static void main(String[] args) {

		Engine engn = new Engine("Petrol", 300);

		Car car = new Car("Alto", engn);
		
		System.out.println("Name of car: " + car.getName() + " , "+ "Type of engine: " + engn.getType() + " ,"
				+ "  Horse power of Engine: " + engn.getHorsePower());
	}
}