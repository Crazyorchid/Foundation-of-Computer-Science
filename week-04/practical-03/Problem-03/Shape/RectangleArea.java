import java.util.Scanner;

public class RectangleArea extends Rectangle {

	public RectangleArea(double width, double height) {
		Scanner input = new Scanner(System.in);
			System.out.print("Input two numbers: " + " ");
		this.width = input.nextInt();
		this.height = input.nextInt();
	}
	public void read_input() {
		if (this.width>=1 & this.height<=10*10*10) {
		display();
		}else {
			System.out.println("Out of calculating range!");
		}
		
	}
	void display() {
		System.out.println(this.width * this.height);
		
	}

}