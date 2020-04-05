package problem2;

public class TestBook {
	public static void main(String[] args) {
		
	Book Hp1 = new Book();
	Hp1.setPage(200);
	Hp1.setTitle("Harry Potter: The Philosopher's Stone");
	Hp1.setPublish("Bloomsbury, UK");
	Hp1.setYear(1997);	
	Hp1.display();
	EBook Hpe1 = new EBook();
	Hpe1.setUrl("https://www.amazon.com.au/Harry-Potter-Complete-Collection-1-7-ebook/dp/B01B3DKROQ");
	Hpe1.displayUrl();
	PhysicalBook hpp1 = new PhysicalBook();
	hpp1.setAisle(7);
	hpp1.setShelf(13);
	hpp1.setFloor(85);
	hpp1.displayBookLocation();
	
	}

}
