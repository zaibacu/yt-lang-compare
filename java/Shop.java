import java.util.ArrayList;
import java.util.List;

public class Shop {
	private static class Product {
		private String name;
		private double price;

		public Product(String name, double price){
			this.name = name;
			this.price = price;
		}

		public double getPrice(){
			return price;
		}
	}

	private static class OrderItem {
		private Product product;
		private int qty;

		public OrderItem(Product product, int qty){
			this.product = product;
			this.qty = qty;
		}

		public double getPrice(){
			return product.getPrice() * qty;
		}
	}

	private static class Order {
		private List<OrderItem> orderItems = new ArrayList<>();

		public Order(){

		}

		public void addOrderItem(OrderItem item){
			orderItems.add(item);
		}

		public double totalSum(){
			return orderItems.stream().mapToDouble(item -> item.getPrice()).sum();
		}
	}

	public static void main(String[] args){
		Product p1 = new Product("Generic Mouse", 12);
		Product p2 = new Product("Generic Keyboard", 10);
		Product p3 = new Product("Candy Bar", 1.5);

		Order o = new Order();

		o.addOrderItem(new OrderItem(p1, 1));
		o.addOrderItem(new OrderItem(p3, 10));

		System.out.println(o.totalSum());
	}
}