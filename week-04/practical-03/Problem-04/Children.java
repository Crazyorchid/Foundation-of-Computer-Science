package Problem4;

public class Children {
	/*ElectricBike b1 = new ElectricBike();
	void displayEbike() {
		b1.displaybat();
		b1.displayEbike();
	}
	MountainBike m1 = new MountainBike();
	void displayMbike() {
		m1.diplayMB();
	}
	Hibrid h1 = new Hibrid();
	void displayHB() {
		h1.displaysus();
	}
	RoadBike r1 = new RoadBike();
	void displayRB() {
		r1.displayTyre();
	}*/
	public static void main(String[] args) {
		ElectricBike b1 = new ElectricBike();
		MountainBike m1 = new MountainBike();
		Hibrid h1 = new Hibrid();
		RoadBike r1 = new RoadBike();
		b1.setBattery("72V");
		m1.setForks("Giant");
		m1.setSuspension("Airpressure");
		h1.setSuspension("Fluid");
		r1.setTyres("700 x 25 mm");
		b1.displaybat();
		m1.diplayMB();
		h1.displaysus();
		r1.displayTyre();
	}

}