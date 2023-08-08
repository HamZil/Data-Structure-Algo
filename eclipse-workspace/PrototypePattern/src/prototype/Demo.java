package prototype;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs = new BookShop();
		bs.setShopName("Alkaram book shop");
		bs.loadData();
		bs.getBooks().remove(2);
		System.out.println(bs);
		
		
		BookShop bs1 = (BookShop)bs.clone();
		bs1.setShopName("Alkaram book shop-II");
		System.out.println(bs1);
	}

}
