package Inheritance;

public class BoxObjectDemo {
    public static void main(String[] args) {
        System.out.println("Box reference and Box object");
		System.out.println("----------------------------");

		Box box1=new Box();

		System.out.println(box1.color);
		System.out.println(box1.height);
		System.out.println(box1.inkColor);
		box1.open();
		box1.close();
		box1.store();
		box1.write();

		System.out.println("\nPen reference and Box obj");
		System.out.println("---------------------------");

		Pen box2=new Box();

		System.out.println(box2.color);
		System.out.println(box2.inkColor);
		box2.open();
		box2.close();
		box2.write();
    }
}
