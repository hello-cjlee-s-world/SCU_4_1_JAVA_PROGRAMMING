package chap14;

public class CustomerTest {
	public static void main(String[] args) {
		Product p = new Product();
		Customer c1 = new Customer(p);
		Customer c2 = new Customer(p);
		Seller s = new Seller(p);
		try {
			c1.start();
			c2.start();
			Thread.sleep(3000);
			s.start();
			c1.join();
			c2.join();
			s.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class Customer extends Thread{
	Product product;
	public Customer(Product product) {
		this.product=product;
	}
	@Override
	public void run() {
		System.out.println("오늘 구매한 특가 상품은 " + product.saleProduct()+"입니다.");
	}
}
class Seller extends Thread{
	Product product;
	public Seller(Product product) {
		this.product=product;
	}
	@Override
	public void run() {
		product.setProduct("iPhone 15 Max");
		System.out.println("오늘의 특가 상품은 "+product.product+"입니다.");
	}
}
class Product{
	String product;
	public void setProduct(String product) {
		this.product=product;
		synchronized(this) {
			notifyAll();
		}
	}
	String saleProduct() {
		if(product==null) {
			try {
				synchronized (this) {					
					wait();
					System.out.println("오픈 전입니다. 오픈까지 기다립니다.");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return product;
	}
	
}
