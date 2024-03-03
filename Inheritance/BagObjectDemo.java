package inheritance;

public class BagObjectDemo {
    public static void main(String[] args) {
		System.out.println("Bag reference and Bag object");
		System.out.println("--------------------");

		Bag bag1=new Bag();

		System.out.println(bag1.color);
		System.out.println(bag1.height);
		System.out.println(bag1.inkColor);
		bag1.open();
		bag1.close();
		bag1.store();
		bag1.write();
        
        System.out.println("\nBox reference and Bag object");
		System.out.println("------------------------------");

		Box bag2 = new Bag();

		System.out.println(bag2.color);

		bag2.open();
		bag2.close();
		bag2.store();
		bag2.write();

		System.out.println("\nPen reference and Bag object");
		System.out.println("------------------------------");

		Pen bag3 = new Bag();

		System.out.println(bag3.color);
		bag3.open();
		bag3.close();
		bag3.write();
    }
}
