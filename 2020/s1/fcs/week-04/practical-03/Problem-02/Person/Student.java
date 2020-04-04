class Student extends Person{
	double [] marks;
	String [] disciplines= {"qq","ii","yy"};
	double total=0;
	double averageMarks;
	public double[] getMarks() {
		return marks;
	}
	public void setMarks(double[] marks) {
		this.marks = marks;
	}
	public String[] getDisciplines() {
		return disciplines;
	}
	public void setDisciplines(String[] disciplines) {
		this.disciplines = disciplines;
	}
	public double averageMarks(){
		for(int i=0; i<marks.length; i++) {
			total += marks[i];
			averageMarks = total/marks.length;
		}
		return averageMarks();
	}
	public void displayDisciplanes() {
		for (int i =0; i< disciplines.length;i++) {	
		System.out.println((disciplines[i]));
		
		}
	}
	
}