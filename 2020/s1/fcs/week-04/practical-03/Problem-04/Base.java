package Problem4;

public class Base {
	public static void main(String[] args) {
		Bicycle a1 = new Bicycle();
		a1.setInDate("23/04/20");
		a1.setOutDate("05/21/20");
		a1.setIs_serviced(true);
		a1.setServiceResponsible("Max");
		a1.displayBicycle();
		
	}
}
