public class Turtle extends Animal {

	public Turtle() {
	}

	public Turtle(String name, double weight, int age, String favoriteFood) {
		super(name, weight, age, favoriteFood);
		
	}
	
	public void makeSound() {
		System.out.println("Bibibibi!");
	}

}