package PumpNearByMe;

import java.util.Comparator;

public class DistanceComparator implements Comparator<PetrolPump> {

	@Override
	public int compare(PetrolPump o1, PetrolPump o2) {
		if (o1.getDistance() == o2.getDistance()) {
			return 0;
		} else if (o1.getDistance() > o2.getDistance()) {
			return 1;
		} else {
			return -1;
		}
	}
}
