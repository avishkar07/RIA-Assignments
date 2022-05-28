package QuetionNo02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int a = 12;
		String  b = "Rahul";
		List<Player> arrayList = new ArrayList<>();
		Player obj1  = new Player(a,b);
		Player obj2  = new Player(112, "Dhoni");
		Player obj3 = new Player(35, "Ashawin");
		Player obj4  = new Player(112, "Rahul");
		Player obj5  = new Player(125, "Sachin");
		Player obj6  = new Player(157, "Jadeja");
		
		arrayList.add(obj1);
		arrayList.add(obj2);
		arrayList.add(obj3);
		arrayList.add(obj4);
		arrayList.add(obj5);
		arrayList.add(obj6);
		
		Iterator<Player> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
		System.out.println(iterator.next());
		}
		System.out.println("After :");
		arrayList.sort(new Checker());

		for (Player player : arrayList) {
			System.out.println(player);
			
		}
		
	}

}
