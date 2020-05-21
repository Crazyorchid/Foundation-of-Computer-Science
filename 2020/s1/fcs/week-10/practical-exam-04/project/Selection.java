/*
*   Foundations of Computer Science
*   2018, Semester 01
*   Practical-Exam-04
*
*   student (id): a111111
*   student (name): John Smitth
*
* Note: in order to finish your exam you need to make changes in this class
* Problem 03
*/
public class Selection extends Sort {
	

	@Override
	public int[] sortIntByIndex(int[] arr) {      //..
		int[]index = this.getIndex(arr.length);

		for (int i = 0; i < arr.length; i++) {
			int min_idx = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;


			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;

		}
		return index;
	}

	@Override
	public int [] sortInt(int [] arr){
		throw new java.lang.UnsupportedOperationException("Not implemented yet!");
	}


	@Override
	public int [] sortStringByIndex(String [] arr){
		throw new java.lang.UnsupportedOperationException("Not implemented yet!");
	}

	@Override
	public String [] sortString(String [] arr){
		throw new java.lang.UnsupportedOperationException("Not implemented yet!");
	}
}
