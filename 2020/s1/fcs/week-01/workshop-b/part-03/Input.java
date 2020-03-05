import java.util.Scanner;

class Input{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		//getting float
		System.out.print("Enter float: ");
		float a = input.nextFloat();
		System.out.println("Float entered = " + a);


		//getting double
		System.out.print("Enter double: ");
		double b = input.nextDouble();
		System.out.println("Double entered= " + b);


		//getting boolean
		System.out.print("Enter true or flase: ");
		boolean c = input.nextBoolean();
		System.out.println("Boolean entered= " + c);

		//getting String
		System.out.print("Enter string: ");
		String d = input.next();
		System.out.println("Text entered = " + d);

		//Getting char
		System.out.print("Enter a character: ");
		char e = input.next().charAt(0);//nextChar();
		System.out.println("Character entered = " + Character.toString(e));



	}
}