package problem2;

public class PhysicalBook extends Book {
	int shelf;
	int aisle;
	int floor;
	
	public PhysicalBook() {
	}

	public PhysicalBook(int shelf, int aisle, int floor) {	
	}
	
	public void displayBookLocation() {
		System.out.println("Shelf: " + " " +shelf + " " +"Aisle: " + aisle + " " + "Floor: " + floor );
	}

	public int getShelf() {
		return shelf;
	}

	public void setShelf(int shelf) {
		this.shelf = shelf;
	}

	public int getAisle() {
		return aisle;
	}

	public void setAisle(int aisle) {
		this.aisle = aisle;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}
	

}
