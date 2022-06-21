package PumpNearByMe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PumpMainn {

public static void main(String[] args) {
	PetrolPump pertolPump1 = new PetrolPump("Shell Petrol Pump,Katraj", 9.1);
	PetrolPump pertolPump2 = new PetrolPump("HP Pertrol Pump ,Kothrud",1.2);	
	PetrolPump pertolPump3 = new PetrolPump("Bharat Petroleum petrol pump ,Sinhgad Rd",11.3);	
	PetrolPump pertolPump4 = new PetrolPump("Bharat Petroleum petrol pump,Shivaji Nagar",7.8);	
	PetrolPump pertolPump5 = new PetrolPump("Shinde Petroleum ,Bavdhan",2.3);	
	PetrolPump pertolPump6 = new PetrolPump("HP Pertrol Pump Pancharatna,Pune station",10.2);	
	
	
	List< PetrolPump> arraylist= new ArrayList<PetrolPump>();
	
	arraylist.add(pertolPump1);
	arraylist.add(pertolPump2);
	arraylist.add(pertolPump3);
	arraylist.add(pertolPump4);
	arraylist.add(pertolPump5);
	arraylist.add(pertolPump6);
	
	Collections.sort(arraylist, new DistanceComparator());
	
	Map<String, List<PetrolPump>> map = new HashMap<String, List<PetrolPump>>();
	map.put("mylocation", arraylist);
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Your Location");
	String userLocation = scan.next();

	Iterator<Entry<String, List<PetrolPump>>> itr = map.entrySet().iterator();

	while (itr.hasNext()) {
		Map.Entry<String, List<PetrolPump>> entry = itr.next();

		if (entry.getKey().equals(userLocation)) {
			System.out.println(entry.getValue());

		}
	}

}
	
}
