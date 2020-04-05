package problem2;

public class TestPerson {
	public static void main(String[] args) {
		
	Person st = new Person();
	Person dc = new Person();
	Person lec = new Person();
	Patient pt = new Patient();
	st.setAge(23);
	st.setCitizenship("CN");
	st.setGender("male");
	st.setGiveName("RT");
	st.setLastName("ZG");
	dc.setAge(50);
	dc.setCitizenship("US");
	dc.setGender("male");
	dc.setGiveName("Max");
	dc.setLastName("ZG");
	lec.setAge(99);
	lec.setCitizenship("Mexico");
	lec.setGender("Male");
	lec.setGiveName("Durane");
	lec.setLastName("Pontius");
	pt.setAge(53);
	pt.setCitizenship("Mars");
	pt.setGender("Unknown");
	pt.setGiveName("Daiqi");
	pt.setLastName("Liu");
	
	st.display();
	dc.display();
	lec.display();
	
	Doctor dc1 = new Doctor();
	dc1.setSpeciality("Radiologist");
	Lecturer lec1 = new Lecturer();
	String [] disciplanes = {"Math", "Science", "Chemistry"};
	lec1.setDisciplanes(disciplanes);
	lec1.displayDisciplanes();
	Student st1 = new Student();
	st1.setDisciplines(disciplanes);
	double[]marks = {30, 90, 60, 80};
	st1.setMarks(marks);
	Patient pt1 = new Patient();
	pt1.display("COVID-9", "9:30", "0:20");
	}

}
