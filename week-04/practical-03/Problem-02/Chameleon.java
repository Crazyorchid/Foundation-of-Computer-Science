package problem2;

public class Chameleon extends Animal {

	public Chameleon() {
		
	}

	public Chameleon(String name, double weight, int age, String favoriteFood) {
		super(name, weight, age, favoriteFood);
	}
	
	public void makeSound() {
		System.out.println("Chameleon says: Hey!");
	}
}
