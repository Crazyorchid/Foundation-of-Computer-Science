package problem2;

public class Rectangle extends Shape {
	

	public Rectangle() {
		
	}

	public Rectangle(double width, double height, double radius, double length) {
		super(width, height, radius, length);
		this.setLength(length);
		this.setWidth(width);
		
	}
	public double area(){
		double area = this.length * this.width;
		return area;
	}

}
