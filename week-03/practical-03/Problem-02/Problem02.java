import java.util.Scanner;

public class Problem02 {
	public static void main(String[]args) {
		try{
			Scanner input = new Scanner(System.in);

			System.out.print("Please, insert a number: ");
			int num = input.nextInt();
			checkPrime(num);
		}catch(Exception e) {
			System.out.println("Please insert a positive proper whole number.");
		}

	}
	static void checkPrime(int n) {
		boolean flag = false;
		for (int i = 2; i <= n/2; ++i) {
			if (n%i==0) {
				flag = true;
				break;
			}
		}
		if(!flag && n>=0)
			System.out.println("Your number is a prime number");
		else {
			System.out.println("Your number is not a prime number");
		
			}
		
	}
}
