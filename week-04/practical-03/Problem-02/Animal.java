package problem2;

public class Animal {
	String name;
	double weight;
	int age;
	String favoriteFood;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	void display() {
		System.out.println("Name: " + this.name);
		System.out.println("Weight: " + this.weight);
		System.out.println("Age: " + this.age);
		System.out.println("FavoriteFood: " + this.favoriteFood);
	}
	Animal() {

	}

	Animal(String name, double weight, int age, String favoriteFood) {

	}
	

}
