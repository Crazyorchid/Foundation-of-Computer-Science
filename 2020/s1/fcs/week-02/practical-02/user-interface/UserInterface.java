import java.util.Scanner;

public class UserInterface{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

				
				System.out.println("Welcom dear user!");
				String option;


				do {
				System.out.print("Please insert the first number: ");
				float first = input.nextFloat();
				System.out.print("Please insert the second number: ");
				float second = input.nextFloat();

				float sum = (float)first + second;

				System.out.println("Thank you for your enquiry, the sum between " + first + " and " + second + " is " + sum);

				System.out.println("Woule you like to: ");
				System.out.println("a) sum again");
				System.out.println("b) exit");
				
				System.out.print("options: ");
				
				option = input.next();
			
			}while (option.equals("a") );
				
				System.out.println("Have a good day");
			}
   
		}
