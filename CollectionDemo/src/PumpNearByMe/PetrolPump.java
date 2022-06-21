package PumpNearByMe;

public class PetrolPump {

	String Name;
	Double Distance;

	public PetrolPump(String name, Double distance) {
		super();
		Name = name;
		Distance = distance;
	}

	@Override
	public String toString() {
		return "PertolPump [Name=" + Name + ", Distance=" + Distance + "]";
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getDistance() {
		return Distance;
	}

	public void setDistance(Double distance) {
		Distance = distance;
	}

}
