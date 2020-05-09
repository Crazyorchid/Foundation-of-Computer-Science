public class LinearSearch extends MySearchAlg{

    @Override
    public int search(int[] array, int num) {
        int index = -1;
        for(int i =0; i<array.length;i++){
            if (array[i] == num){
                index = num;
                break;
            }
        }
        return num;
    }
}
