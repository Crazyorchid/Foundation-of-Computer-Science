import java.util.*;

public class Randomnumbers{
	public static void main (String[]args){
		// Create new random number//

			Random ran = new Random();

			int sum = 0;

		for (int i = 0; i < 10; i++){

			int randnum = ran.nextInt(10);			
		
			System.out.print(" , " + randnum );
			sum = sum + randnum;

		}
		
		System.out.println(" Sum = " + sum);

		float mean = (float)sum/10;

		System.out.println("The average of ten numbers is: " + mean);
		

		}
			
	}