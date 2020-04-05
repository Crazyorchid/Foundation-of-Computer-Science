package Problem4;

public class Bicycle extends Base {
	boolean is_serviced;
	String inDate;
	String outDate;
	String serviceResponsible;

	public void checkoutService() {
		System.out.println("Checkout successfully!");

	}

	public void setIs_serviced(boolean is_serviced) {
		this.is_serviced = is_serviced;
	}

	public void setInDate(String inDate) {
		this.inDate = inDate;
	}

	public void setOutDate(String outDate) {
		this.outDate = outDate;
	}

	public void setServiceResponsible(String serviceResponsible) {
		this.serviceResponsible = serviceResponsible;
	}
	
	void displayBicycle() {
			if (is_serviced = true) {
				System.out.println("Your bicycle has been serviced!");
			}else {
				System.out.println("Please wait to be serviced!");
			
			}
		System.out.println("Date comes in: " + this.inDate);
		System.out.println("Date checkout: " + this.outDate);
		System.out.println("Service Resibonsible: " + this.serviceResponsible);
	}
}

