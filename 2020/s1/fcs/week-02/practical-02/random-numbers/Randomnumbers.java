import java.util.*;

public class Randomnumbers{
	public static void main (String[]args){
		// Create new random number//

			Random ran = new Random();

		for (int i = 0; i < 10; i++){

			int randnum = ran.nextInt(10);			
		
			System.out.println("The random numbers are: " + randnum);
		}
		}
			
	}