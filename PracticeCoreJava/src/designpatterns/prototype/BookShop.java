package designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
	
	private String shopname;
	private List<Book> bookshelf=new ArrayList<>();
	
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public List<Book> getBookshelf() {
		return bookshelf;
	}
	public void setBookshelf(List<Book> bookshelf) {
		this.bookshelf = bookshelf;
	}
	
	public void loadBooks(){
		for(int i=0;i<10;i++)
		{
			Book b= new Book(i,"book "+i);
			getBookshelf().add(b);
		}
	}
	
	@Override
	public String toString() {
		return "BookShop [shopname=" + shopname + ", bookshelf=" + bookshelf + "]";
	}
	
	@Override
	protected BookShop clone() throws CloneNotSupportedException 
	{
		
		BookShop bs = new BookShop();
		
		for(Book b: getBookshelf() )
		{
			bs.getBookshelf().add(b);
		}
		
		return bs;
	}
	
	

}
