public class PhysicalBook extends Book {
	int shelf;
	int aisle;
	int floor;
	
	public PhysicalBook() {
	}

	public PhysicalBook(int shelf, int aisle, int floor) {	
	}
	
	public void displayBookLocation() {
		System.out.println("Shelf: " + shelf + "Aisle: " + aisle + "Floor: "+ floor );
	}
	

}