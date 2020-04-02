//==================================
// Foundations of Computer Science
// Student: Runtao Zhuge
// id: a1778478
// Semester:1
// Year:2020
// Practical Exam Number:02
//===================================
public class DebuggingDemo {

	    public static void bugMethod() {
	         int num[] = {1, 2, 3, 4};
	         System.out.println(num[3]);//changed the num[5] to 3 because the index count is from 0 to 3 for this one
	     }

	    public static int bugMethod2() {//changed this to a static method so the method can be called
	            float ans = (float) 0.0;//make sure the variable is a float type
	            System.out.println("This method had a bug!");
	            return (int) ans;//the return type should be the same as the method type, so added int to the return type
	     }

