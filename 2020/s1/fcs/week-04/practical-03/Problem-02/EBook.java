package problem2;

public class EBook extends Book {
	String url;
	

	public EBook() {
	}

	public EBook(String url) {
	
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	void displayUrl() {
		System.out.println("URL: " + this.url);
	}

}
