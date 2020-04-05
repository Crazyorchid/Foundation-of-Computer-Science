package problem2;

public class Patient extends Person {
	String diagnostic;
	String inTime;
	String prevTime;
	
	public Patient() {
		
	}

	public Patient(String diagnostic, String inTime, String prevTime) {
		
	}

	public String getDiagnostic() {
		return diagnostic;
	}

	public void setDiagnostic(String diagnostic) {
		this.diagnostic = diagnostic;
	}

	public String getInTime() {
		return inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public String getPrevTime() {
		return prevTime;
	}

	public void setPrevTime(String prevTime) {
		this.prevTime = prevTime;
	}
	void display(String diagnostic, String inTime, String prevTime) {
		System.out.println("Diagnostic: " + diagnostic);
		System.out.println("In time: "+ inTime);
		System.out.println("Previouse time: " + prevTime);
	}

}
