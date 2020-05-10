import java.util.HashSet;
import java.util.Scanner;
public class nextHappyNum {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input: ");
        int n = in.nextInt();
// print output
        System.out.println("Input: " + n);
        System.out.println("Output: " + nextHappyNum(n));
    }
    // method to find next happy number

    public static int nextHappyNum(int num)
    {
        num += 1;
        // loop until next happy number
        while(true)
        {
            if (isHappyNum(num) == true)
                return num; // return number if a happy number
            else
                num += 1;
        }

    }
        // method to find if a number is a happy number
        private static boolean isHappyNum(int number) {
            HashSet<Integer> sequence = new HashSet<Integer>();
            while (!sequence.contains(number)) {
                sequence.add(number);
                number = sumOfDigits(number);
                if (number == 1) {
                    return true;
                }
            }
            return false;
        }


    public static int sumOfDigits(int num) {
        if (num == 0)
            return 0;
        else {
            int temp = num % 10;
            return (temp * temp + sumOfDigits(num / 10));
        }
    }
}
