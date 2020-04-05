package problem2;

public class Book {
	String title;
	int year;
	String publish;
	int page;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	void display() {
		System.out.println("Title: " + this.title );
		System.out.println("Year: " + this.year);
		System.out.println("Publish: " + this.publish);
		System.out.println("Page: " + this.page);
	}
	Book() {

	}

	Book(String title, int year, String publish, int page) {

	}

}
