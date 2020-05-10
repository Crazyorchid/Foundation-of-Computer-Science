import java.util.Arrays;

public abstract class MySortAlg {
    abstract int [] sort(int[] array);

    public void printArray(int [] array){
        System.out.print("[");
        for(int i = 0; i < array.length-1; i++){
            System.out.print(array[i]+", ");
        }
        System.out.print(array[array.length-1]+"]\n");
    }

}
