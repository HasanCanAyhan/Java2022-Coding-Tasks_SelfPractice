package task2.classesWithAttributes;

public class ProductManager {
	public void save(Product product) {

		//JDBC connects to DB
		System.out.println("product is saved " + product.getName() + " - " + product.getDescription());
	}
	
	public void save2(int id, String name, String description, int stockAmount, double price) {
			
	}
}
