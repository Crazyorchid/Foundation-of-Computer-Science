public class BaseOperations {
	public static void printArray(int [] array){
		for (int element: array) {
			System.out.println(element);
		}

	}
	public static void printArray2(String [] array){
		for (String element: array) {
			System.out.println(element);
		}

	}
	public static void printArray3(float [] array){
		for (float element: array) {
			System.out.println(element);
		}

	}
	public static void reverseArray(int[]array) {
		for (int i=array.length-1; i>=0; i--) {
			System.out.println(array[i]);
				}


			}
		

	public static void main(String[]args) {
		int x [] = {4, 9, 6, 2, 3};
		reverseArray(x);
		printArray(x);



	}

}
