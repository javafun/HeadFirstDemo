package Iterator;

public class MenuItem {
	String name;
	String description;
	boolean vegetarain;
	double price;

	public MenuItem(String name, String description, boolean vegetarain,
			double price) {

		this.name = name;
		this.description = description;
		this.vegetarain = vegetarain;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public boolean isVegetarian() {
		return vegetarain;
		
	}
	

}
