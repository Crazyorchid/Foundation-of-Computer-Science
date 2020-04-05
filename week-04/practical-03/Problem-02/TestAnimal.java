package problem2;

public class TestAnimal {
	public static void main(String[] args) {
		
		Animal Lion1 = new Animal();
		Lion1.setAge(29);
		Lion1.setFavoriteFood("Chicken");
		Lion1.setName("Shizi");
		Lion1.setWeight(300);
		Lion ao = new Lion();
		ao.makeSound();
		Lion1.display();
		
		Animal Turtle1 = new Animal();
		Turtle bibi = new Turtle();
		Turtle1.setAge(35);
		Turtle1.setFavoriteFood("Double Cheese Burger");
		Turtle1.setName("Wugui");
		Turtle1.setWeight(60);
		bibi.makeSound();
		Turtle1.display();
		
		Animal Chameleon1 = new Animal();
		Chameleon1.setAge(35);
		Chameleon1.setFavoriteFood("Burgers");
		Chameleon1.setName("Wugui");
		Chameleon1.setWeight(60);
		Chameleon hey = new Chameleon();
		hey.makeSound();
		Chameleon1.display();
		
		
		
		
		
	}

}
