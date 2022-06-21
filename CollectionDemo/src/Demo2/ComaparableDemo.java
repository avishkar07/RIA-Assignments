package Demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ComaparableDemo {

	public static void main(String[] args) {

		Customer customer1 = new Customer("Shubham", "Hinjewadi");
		Customer customer2 = new Customer("Avishkar", "Kothrud");
		Customer customer3 = new Customer("Sonali", "Bavdhan");
		Customer customer4 = new Customer("Pooja", "Bavdhan");
		Customer customer5 = new Customer("Guru", "Katraj");
		Customer customer6 = new Customer("Shilpa", "Katraj");

		List<Customer> customerList = new ArrayList<>();

		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		customerList.add(customer6);

		Iterator<Customer> iterator = customerList.iterator();
		while (iterator.hasNext()) {
			Customer c = (Customer) iterator.next();
			System.out.println(c);
		}
		System.out.println("After sorting");
		Collections.sort(customerList, (c1, c2) -> c1.City.compareTo(c2.City));
		
		Iterator<Customer> iterator1 = customerList.iterator();
		while (iterator1.hasNext()) {
			Customer c1 = (Customer) iterator1.next();
			System.out.println(c1);
		}
		
//		Iterator<Customer> iterator2 = customerList.iterator();
//		Scanner scanner =new Scanner(System.in);
//		System.out.println("Ether the City :");
//		String s =scanner.next();



	}
}
