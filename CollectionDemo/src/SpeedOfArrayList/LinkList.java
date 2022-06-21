package SpeedOfArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkList {
	public static void main(String[] args) {

		List<Integer> linkedlist = new LinkedList<>();

		for (int i = 0; i < 10000000; i++) {
			linkedlist.add(i);
		}

		long start = System.currentTimeMillis();
		System.out.println("Start time "+start);
		Iterator iterator = linkedlist.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
//			System.out.println(object);
		}

		long end = System.currentTimeMillis();
		// System.out.println(start);
		System.out.println("End Time "+end);
		
		System.out.println("total Time "+(end-start));
			
	}
}
