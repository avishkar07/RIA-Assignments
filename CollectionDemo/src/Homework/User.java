package Homework;

public class User {
	public Integer Customer_id ;
	public String name ;
	public String Address;
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(Integer customer_id, String name, String address) {
		super();
		Customer_id = customer_id;
		this.name = name;
		Address = address;
	}
	
	public Integer getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		Customer_id = customer_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "User [Customer_id=" + Customer_id + ", name=" + name + ", Address=" + Address + "]";
	}

}
