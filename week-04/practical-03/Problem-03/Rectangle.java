package problem3;

public class Rectangle extends Shape {
	

	public Rectangle() {
		
	}

	public Rectangle(double width, double height, double radius, double length) {
		super(width, height, radius, length);
		this.setLength(height);
		this.setWidth(width);
		
	}
	public double area(){
		double area = this.height * this.width;
		return area;
	}

}
