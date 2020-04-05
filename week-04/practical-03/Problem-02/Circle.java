package problem2;

public class Circle extends Shape {

	public Circle() {
	
	}

	public Circle(double width, double height, double radius, double length) {
		super(width, height, radius, length);
		this.setWidth(radius);
		
	}
	public double area() {
		double area = 2*3.14*radius*radius;
		return area;
	}
	

}
