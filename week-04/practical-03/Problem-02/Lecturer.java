package problem2;

public class Lecturer extends Person {
	double salary;
	String []disciplanes;
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String[] getDisciplanes() {
		return disciplanes;
	}
	public void setDisciplanes(String[] disciplanes) {
		this.disciplanes = disciplanes;
	}
	//defult constructor
	Lecturer(){
		
	}
	
	//parametized constructor
	Lecturer(double salary, String disciplanes){
		
	}
	//methods
	public double annualSalary() {
		return salary;
		 }
	
	public void displayDisciplanes(){
		for (int i=0;i<disciplanes.length;i++) {
			System.out.println(disciplanes[i]);
		}
		
	}
	 

}
