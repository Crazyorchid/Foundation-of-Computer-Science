package problem2;

public class Lion extends Animal {

	public Lion() {
	
	}

	public Lion(String name, double weight, int age, String favoriteFood) {
		super(name, weight, age, favoriteFood);
	}
	
	public void makeSound() {
		System.out.println("Lion says: Aooooo!");
		
	}
}
