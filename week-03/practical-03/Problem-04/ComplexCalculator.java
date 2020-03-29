public class ComplexCalculator {
	
	double real; double imagine;
	
	ComplexCalculator(double r, double i){
		this.real = r;
		this.imagine = i;

}
	public static ComplexCalculator add(ComplexCalculator c1, ComplexCalculator c2) {//method created and real & imagine number were created
		ComplexCalculator num = new ComplexCalculator(0,0);
		
		num.real = c1.real + c2.real;
		num.imagine = c1.imagine + c2.imagine;
		
		return num;
		
	}
	//using formula to create method for all 4 types of operations
	public static ComplexCalculator multiplication(ComplexCalculator c1, ComplexCalculator c2) {
		ComplexCalculator num = new ComplexCalculator(0,0);
		
		num.real = c1.real * c2.real - c1.imagine*c2.real;
		num.imagine = c1.imagine * c2.imagine;
		
		return num;
}
	public static ComplexCalculator division(ComplexCalculator c1, ComplexCalculator c2) {
		ComplexCalculator num = new ComplexCalculator(0,0);
		
		num.real = c1.real / c2.real -c1.imagine/c2.imagine;
		num.imagine = c1.real / c2.imagine + c1.imagine/c2.real;
		
		return num;
	}
	
	public static ComplexCalculator sub(ComplexCalculator c1, ComplexCalculator c2) {
		ComplexCalculator num = new ComplexCalculator(0,0);
		
		num.real = c1.real - c2.real;
		num.imagine = c1.imagine - c2.imagine;
		
		return num;
	}
	//Put the methods in and make sure and type out the output.
	
	public static void main(String[]args) {
		ComplexCalculator c1= new ComplexCalculator(10, 9);
		ComplexCalculator c2 = new ComplexCalculator(6, 3);
		ComplexCalculator num = add(c1, c2);
		ComplexCalculator num2 = multiplication(c1, c2);
		ComplexCalculator num3 = division(c1, c2);
		ComplexCalculator num4 = sub(c1, c2);
		System.out.println("Sum = " + num.real + "+" + num.imagine + "i");
		System.out.println("Multiplication = " + num2.real * num2.imagine);
		System.out.println("Division = "+ num3.real + "/" + num3.imagine + "i");
		System.out.println("Substraction = " + num4.real + "- (" + num4.imagine + "i)");
		
		
	}
}
	