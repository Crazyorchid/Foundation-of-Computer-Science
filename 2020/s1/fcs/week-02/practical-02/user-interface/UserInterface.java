import java.util.Scanner;

public class UserInterface{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("Welcom dear user!");
		
		

			System.out.print("Please insert the first number: ");
			double first = input.nextDouble();
			System.out.print("Please insert the first number: ");
			double second = input.nextDouble();

			double sum = first + second;

			System.out.println(" Thank you for your enquiry, the sum between " + first + " and " + second + " is " + sum);

			System.out.println("Woule you like to: ");
			
			//System.out.println("a) sum again");
			//System.out.println("b) exit");

