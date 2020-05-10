public class Main {
    private static boolean test(int[] result, int[] ans){
        for(int i = 0; i<ans.length;i++){
            if(result[i] != ans[i]){
                return false;
            }
        }
        return true;
    }
    //compare if two arrays contain same set of elements
    private static boolean compare(int[] arr1, int[] arr2){
        InsertionSort a = new InsertionSort();
        int [] ar = a.sort(arr1);
        int [] ar2 = a.sort(arr2);
        for(int i = 0; i<ar.length;i++){
            if(ar[i] != ar2[i]){
                return false;
            }
        }
        return true;
    }
    //get the smallest sum of two elements in an array
    public static int findSmallestSum(int[] array){
        InsertionSort a = new InsertionSort();
        int [] ar = a.sort(array);
        int sum = ar[ar.length-1]+ar[ar.length-2];
        return sum;
    }

    public static void main(String[] args) {
//create three instances of the algorithms
//and the original array and its sorted form
        InsertionSort a = new InsertionSort();
        MergeSort b = new MergeSort();
        QuickSort q = new QuickSort();
        int [] arr = {9,21,6,9,11,26};
        int [] ans = {29,18,10,4,3,1};
        int [] arr2 = {5,6,2,56,9,15};
//create 3 results of different sorting algorithms
        int [] result = a.sort(arr);
        int [] result1 = b.sort(arr);
        int [] result2 = q.sort(arr);
//print the results of testing the algorithms
        System.out.println(test(result, ans)+" "+test(result1, ans)+" "+test(result2, ans));
        System.out.println(compare(arr,arr2));
        System.out.println("smallest sum is "+findSmallestSum(arr2));
    }
}
