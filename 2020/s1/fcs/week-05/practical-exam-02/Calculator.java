//==================================
// Foundations of Computer Science
// Student: Runtao Zhuge
// id: a1778478
// Semester:1
// Year:2020
// Practical Exam Number:02
//===================================
public class Calculator {
	
	public int sum(int numA, int numB) {
		return numA + numB;
	}

	public int sub(int numA, int numB) {
		return numA - numB;
	}

	public float multiply(float numA, float numB) {
		return numA*numB;
	}

	public float division(float numA, float numB) {
		if (numB!=0) {
			return numA/numB;
		}
		else return (float) -99.0;
	}
}