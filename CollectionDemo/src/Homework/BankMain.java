package Homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class BankMain {
	public static void main(String[] args) {
		List<User> arrayList = new ArrayList<User>();

		try {

			String url = "jdbc:mysql://localhost:3306/Ria_advisory";
			String usr = "root";
			String pass = "root";

			Connection connection = DriverManager.getConnection(url, usr, pass);
			Statement statement = connection.createStatement();
			String query = "SELECT * FROM ria_advisory.user;";

			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				User user = new User();

				user.setCustomer_id(resultSet.getInt("id"));
				user.setName(resultSet.getString("name"));
				user.setAddress(resultSet.getString("address"));
				arrayList.add(user);
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		Iterator<User> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

		Map<String, List<User>> map = new HashMap<String, List<User>>();
		map.put("HDFC", arrayList);

		Collections.sort(arrayList, (e1, e2) -> e1.Address.compareTo(e2.Address));
		Iterator<Entry<String, List<User>>> itr = map.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry<String, List<User>> entry = itr.next();
			System.out.println("___________________"+entry.getKey()+" Banks Customer ______________________");
			List<User> list = entry.getValue();
			list.forEach(n -> System.out.println(n));
		}
		System.out.println("-----key  and Value of hash map :-----");
		System.out.println(map.entrySet());

	}
}