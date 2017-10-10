package adapterPattern;

public class Calculate {
	private Product[] products;

	public int calculate() {
		int sum = 0;
		for (Product product : products) {
			sum += product.getPrice();
		}
		return sum;
	}
}