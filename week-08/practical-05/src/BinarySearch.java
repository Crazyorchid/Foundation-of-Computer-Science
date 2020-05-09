public class BinarySearch extends MySearchAlg {
    @Override
    public int search(int[] array, int num) {
        int left = 0, right = array.length - 1;
        int index = -1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == num) {
                index = mid;
                break;
            }
            if (array[mid] < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return index;


    }
}

