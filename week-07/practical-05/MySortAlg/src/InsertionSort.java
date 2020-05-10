public class InsertionSort extends MySortAlg{

        //insertion sort method in descending order
        public int[] sort(int[] array){
            int n = array.length;
            for(int i = 1; i<n; i++){
                int key = array[i];
                int j = i - 1;

                while (j>=0 && array[j]<key) { //all elements bigger than key will be moved to the front
                    array[j+1] = array[j];
                    j = j -1;
                }
                array[j+1] = key;
//this.printArray(array);
            }
            return array;
        }
    }
