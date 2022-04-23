package designpatterns.prototype;

public class Book {
	private int bid;
	private String bname;
	
	public Book(int bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + "]";
	}
	
	
}
