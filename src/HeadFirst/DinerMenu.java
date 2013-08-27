package HeadFirst;

public class DinerMenu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;

	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];

		addItem("Vegetarian BLT",
				"(Fakin') Bacon with lecttuce & tomato on the whole wheat",
				true, 2.99);
		addItem("BLT", "Bacon with lecttuce & tomato on the whole wheat",
				false, 2.99);
		addItem("Soup of the day",
				"Soup of the day, with a side of potato salad", false, 3.29);
		addItem("Hotdog",
				"A hot dog, with saurkraut, relish, onions, topped with cheese",
				false, 3.05);
		addItem("Lamb Fillet & Haloumi Salald",
				"grilled lamb, mixed leaf, mint shaved fennel, red onion, cucumber, slow roasted tomatoes, pumpkin & aged balsamic (GF)",
				false, 19.5);
	}

	public void addItem(String name, String description, boolean vegetarain,
			double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarain, price);

		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full! Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}

	/*
	 * public MenuItem[] getMenuItems() { return this.menuItems; }
	 */

	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
}
