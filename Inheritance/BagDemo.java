package Inheritance;

public class BagDemo {
    public static void main(String[] args) {
		System.out.println("Bag interface and Bag object");
		System.out.println("----------------------------");

		BagInterface bag = new Bag();

		bag.close();

		System.out.println("\nBox interface and Bag obj");
		System.out.println("--------------------------");

		BoxInterface box = new Bag();

		box.open();
		box.close();

		System.out.println("\nBox interface2 and Bag object");
		System.out.println("-------------------------------");

		BoxInterface2 box2 = new Bag();

		box2.store();
		box2.write();

		System.out.println("\nPen interface and Bag object");
		System.out.println("------------------------------");

		PenInterface pen = new Bag();

		pen.open();
		pen.write();

		System.out.println("\nPen interface2 and Bag obj");
		System.out.println("----------------------------");

		PenInterface2 pen2 = new Bag();

		pen2.close();
		pen2.open();
    }

}
