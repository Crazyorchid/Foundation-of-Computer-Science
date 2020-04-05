package problem2;

public class Doctor extends Person {
	String speciality;

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	Doctor(){
		
	}
	Doctor(String speciality){
		
	}
	void display() {
		System.out.println("Speciality: " + this.speciality);
	}
}
