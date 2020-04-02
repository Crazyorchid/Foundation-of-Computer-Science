//==================================
// Foundations of Computer Science
// Student: Runtao Zhuge
// id: a1778478
// Semester:1
// Year:2020
// Practical Exam Number:02
//===================================
public class HandlingArrays {
	 public static void printArray(double [] testArray) {
				for (double element: testArray) {
					System.out.println(element);
				}
    }
	 

   public static double[] sumElements(double [] firstArray, double [] secondArray) {
	   int [] sum = new int [firstArray.length];
	   for (int i=0; i<firstArray.length-1;i++) {
		   sum[i] = (int) (firstArray[i] + secondArray[i]);
	   }
	return secondArray;
		   
    }

   public static double[] reverseArray(double [] testArray) {
			for (int i=testArray.length-1; i>=0; i--) {
				System.out.println(testArray[i]);
					}
			return testArray;
    }

}
