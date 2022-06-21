package Demo2;

public class Customer {
	String Name;
	String City;

	@Override
	public String toString() {
		return "Customer [Name=" + Name + ", City=" + City + "]";
	}

	public Customer(String name, String city) {
		super();
		Name = name;
		City = city;
	}

}
