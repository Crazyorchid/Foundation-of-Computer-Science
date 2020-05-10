import java.util.Random;

public class QuickSort extends MySortAlg{



        public int[] sort(int[] array){
            sort(array, 0, array.length-1);
            return array;
        }

        //sort using a split arrays method
        private void sort(int[] array, int low, int high){
            if(low<high+1){
                int p = partition(array, low, high);
                sort(array, low, p-1);
                sort(array, p+1, high);
            }
        }

        //swap function used to exchange values of two positions
        private void swap(int[] array, int index1, int index2){
            int tmp = array[index1];
            array[index1] = array[index2];
            array[index2] = tmp;
        }

        //randomly generates the pivot position
        private int getPivot(int low, int high){
            Random r = new Random();
            return r.nextInt((high - low) + 1) + low;
        }

        private int partition(int[] array, int low, int high){
//swap low and pivot to put pivot value in the first position
            swap(array, low, getPivot(low,high));
//lower boundary of the right side of pivot
            int boundary = low + 1;
            for(int i = boundary; i<=high; i++){
//use for loop to compare value of ith position and pivot value
//if value of ith position is greater than pivot value
//exchange the positions of a[i] and a[boundary+1]
                if(array[i]>array[low]){
                    swap(array, i, boundary++);
                }
            }

            swap(array,low,boundary-1);
//this.printArray(array);
//return the position of the pivot value
            return boundary-1;
        }
    }
