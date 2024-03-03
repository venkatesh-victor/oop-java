package Inheritance;

public class PenDemo {
    public static void main(String[] args) {
        System.out.println("Pen interface and Pen object");
        System.out.println("----------------------------");

        PenInterface pen = new Pen();

        pen.open();
        pen.write();

        System.out.println("\nPen interface2 and Pen object");
        System.out.println("_______________________________");

        PenInterface2 pen2 = new Pen();

        pen2.open();
        pen2.close();
    }
}
