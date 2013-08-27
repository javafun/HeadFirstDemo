package Iterator;

public class MenuTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		
		Waitress waitree = new Waitress(pancakeHouseMenu, dinerMenu);
		
		waitree.printMenu();
	}

}
