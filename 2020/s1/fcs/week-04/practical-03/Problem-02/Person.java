package problem2;

public class Person {
	String giveName;
	String lastName;
	int age;
	String gender;
	String citizenship;

	// Basic constructor

	Person() {

	}

	// Parametric constructor
	Person(String giveName, String lastName, String gender, String citizenship, int age) {
	}
	
	// accessor
	public String getGender() {

		return gender;
	}

	// mutator
	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public String getGiveName() {
		return giveName;
	}

	public void setGiveName(String giveName) {
		this.giveName = giveName;
	}
	void display() {
		System.out.println("Give Name: "+ this.giveName);
		System.out.println("Last Name: "+ this.lastName);
		System.out.println("Age: " + this.age);
		System.out.println("Gender: " + this.gender);
		System.out.println("Citizenship: " + this.citizenship);
	}

		
}
