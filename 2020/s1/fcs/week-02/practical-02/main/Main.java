//Student name: Runtao Zhuge
//Student ID a1778478
//Practical 02 
import java.util.Scanner;
/*import the scanner*/

public class Main{
	

		public static void main(String[]args){
			
			Scanner input = new Scanner(System.in);
			//Set up the input as the new object to be scanned//
			System.out.print("Enter the amount you would like to withdraw: ");
			int cash = input.nextInt();
			//ask the user to input the amount and store as an integer//
			System.out.println(run(cash));
		//call the method "run"//
	}
		 static String run(int amount){
			 //creating the method "run" as a static method//
			int x = amount/50;//$50 notes
			int y = (amount%50)/20;//$20 notes
			int z = amount/20;//if only $20 notes if only $20 dollars can be withdraw//
			
			if (amount % 20 == 0)//returns the number of $20 notes//
				return"Here is " + z + " $20 notes and " + " 0 $50 notes.";
			
			if((x*50 + y* 20) < amount || amount < 20 ) //returns the cannot be done notes//
				return"Sorry, the value you input cannot be withdrew";
			 
			return"Here is " + y + " $20 notes and " + x + " $50 notes.";
			//returns the combination of $20 and $50 notes//

		}
	}
