package Problem4;

public class ElectricBike extends Children {
	String battery;
	public void chargeBike(){
		System.out.println("Remeber to charge your bike when you ride it!");
		
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	
	void displaybat() {
		System.out.println("Battery: " + this.battery);
	}

}
