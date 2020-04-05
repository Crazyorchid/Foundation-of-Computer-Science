package Problem4;

abstract class VehicleAbstract implements Vehicle {
	String color;
	int year;
	int numberGears;
	
	public VehicleAbstract(){
		
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setNumberGears(int numberGears) {
		this.numberGears = numberGears;
	}
	void displaynumberGears() {
		System.out.println("Number of gears: " + this.numberGears);
		System.out.println("Year: " + this.year);
		System.out.println("Color: " + this);
	}

}

