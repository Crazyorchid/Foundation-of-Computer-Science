import java.lang.reflect.Array;
import java.util.Arrays;

import static jdk.nashorn.internal.objects.NativeRegExp.test;
public class Main{
public static void main(String[] args){

        System.out.println("Testing the Linear Search");
        int test1[]={3,6,9,45,-8,9,10};
        int Search1=10;
        System.out.println("Searching "+Search1+" in "+Arrays.toString(test1)+"..");
        int linSearchResult=new LinearSearch().search(test1,Search1);
        int linSearchExpected=3;
        boolean Status1=test(linSearchResult,linSearchExpected);
        System.out.println("Actual Result: "+linSearchResult);
        System.out.println("Expected Result: "+linSearchExpected);
        System.out.println("Linear Search Result Status: "+Status1);

        System.out.println("\nTesting the Binary Search");
        int test2[]={5,15,20,69,34,24,5,-9,-13};
        int Search2=15;
        System.out.println("Searching "+Search2+" in "+Arrays.toString(test2)+"..");
        int binSearchResult=new BinarySearch().search(test2,Search2);
        int binSearchExpected=1;
        boolean biStatus=test(binSearchResult,binSearchExpected);
        System.out.println("Actual Result: "+binSearchResult);
        System.out.println("Expected Result: "+binSearchExpected);
        System.out.println("Binary Search Result: "+biStatus);

        System.out.println("\nTesting another Binary Search");
        int test3[]={9,8,5,6,2,4,-4,-15,-7,-9};
        int Search3=-9;
        System.out.println("Searching "+Search3+" in "+Arrays.toString(test3)+"");
        int binSearchResultAnother=new BinarySearch().search(test3,Search3);
        int binSearchExpectedAnother=-1;
        boolean bBiStatus3=test(binSearchResultAnother,binSearchExpectedAnother);
        System.out.println("Actual Result: "+binSearchResultAnother);
        System.out.println("Expected Result: "+binSearchExpectedAnother);
        System.out.println("Binary Search Result: "+bBiStatus3);

    //testing the findMaxVal
    System.out.println("\nTesting the findMaxVal() method..");
    int testCaseArr4[] = {5, 9, 10, 12, 22, 23, 19, 15, 13};
    int resultMaxIndex = findMaxVal(testCaseArr4);
    int expectedMaxIndex = 6;
    boolean status = test(resultMaxIndex, expectedMaxIndex);
    System.out.println("Actual Result: " + resultMaxIndex);
    System.out.println("Expected Result: " + expectedMaxIndex);
    System.out.println("Result status: " + status);
}



    private static boolean test(int result, int ans)
    {
        return(result == ans);
    }

    private static int findMaxVal(int array[])
    {
        int max = array[0];
        int maxIndex = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] > max)
            {
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static String arrayToString(int[] arr)
    {
        String res = "[";
        for(int i = 0; i < arr.length; i++)
        {
            if(i == arr.length - 1)
                res += arr[i] + "]";
            else
                res += arr[i] + ", ";
        }
        return res;
    }
}

