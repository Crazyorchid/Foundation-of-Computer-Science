import java.util.Scanner;
public class Problem03 {
	public static void main(String[]args) {
		try{
			Scanner input = new Scanner(System.in);
		System.out.print("Please, insert a number: ");
		double num1 = input.nextDouble();
		System.out.print("Please, insert a number: ");
		double num2 = input.nextDouble();
		compareNum(num1, num2);
		}catch(Exception e) {
			System.out.println("Please, try again");
		}//use catch and try to make sure the right types of variables have been entered
		
	}
	

	public static void compareNum(double x, double y) {
		if(x>y) {
			System.out.println("The bigger number is " + x);
		}
		if(x<y) {
			System.out.println("The bigger bumber is " + y);
		}
		else {
			System.out.println("They are equal");
		}
	}
}