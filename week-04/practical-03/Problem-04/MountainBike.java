package Problem4;

public class MountainBike extends Children {
	String suspension;
	String forks;
	public void setSuspension(String suspension) {
		this.suspension = suspension;
	}
	public void setForks(String forks) {
		this.forks = forks;
	}
	
	void diplayMB() {
		System.out.println("Suspension: " + this.suspension);
		System.out.println("Forks: " + this.suspension);
	}
	

}
