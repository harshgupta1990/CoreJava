package designpatterns.prototype;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookShop bs1 = new BookShop();
	
		bs1.setShopname("Gupta Book Store");
		bs1.loadBooks();
		
//		BookShop bs2 = new BookShop();
//		bs2.setShopname("Chaudhri book Depot");
//		bs2.loadBooks();
		
		BookShop bs2 = (BookShop) bs1.clone();
		bs2.setShopname("Choudhary Book Depot");
		
		bs1.getBookshelf().remove(1);
		System.out.println(bs1);
		System.out.println(bs2);
	}

}
