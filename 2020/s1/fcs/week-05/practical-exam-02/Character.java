//==================================
// Foundations of Computer Science
// Student: Runtao Zhuge
// id: a1778478
// Semester:1
// Year:2020
// Practical Exam Number:02
//===================================
public class Character {
	private String name;
	private int age; 
	private String gender;
	private String occupation;
	private String familyRole;
	private float rate;

	public Character(){
		name ="";
		int age;
		gender="";
		occupation="";
		familyRole="";
		float rate;


	}
	public Character(String name, int age, float rate,String gender, String occupation, String familyRole){
	

	}
	public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}
	public String getgender()
	{
		return gender;
	}
	public String getoccupation()
	{
		return occupation;
	}
	public String familyRole()
	{
		return familyRole;
	}
	public float getrate()
	{
		return rate;
	}
	
	public void setmutators(String name, int age, float rate,String gender, String occupation, String familyRole) {
		this.name = name;
		this.age = age;
		this.rate = rate;
		this.gender = gender;
		this.occupation = occupation;
		this.familyRole = familyRole;
		
		
		
	}

}
	
