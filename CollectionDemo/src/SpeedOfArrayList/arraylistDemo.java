package SpeedOfArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylistDemo {
	public static void main(String[] args) {

		List<Integer> arraylist = new ArrayList<>();

		for (int i = 0; i < 10000000; i++) {
			arraylist.add(i);
		}
		long start = System.currentTimeMillis();
		System.out.println("Start time "+start);
		Iterator iterator = arraylist.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();

		}
		long end = System.currentTimeMillis() ;
		// System.out.println(start);
		System.out.println("End time "+end);
		
		System.out.println("total time :"+(end-start));

	}
}
