package Inheritance;

public class BoxDemo {
    public static void main(String[] args) {
        System.out.println("Box interface and Box object");
        System.out.println("____________________________");

        BoxInterface box = new Box();

        box.open();
        box.close();

        System.out.println("\nBox interface2 and Box object");
        System.out.println("_______________________________");

        BoxInterface2 box2 = new Box();

        box2.store();

        System.out.println("\nPen interface and Box object");
        System.out.println("______________________________");

        PenInterface pen = new Box();

        pen.open();
        pen.write();

        System.out.println("\nPen interace2 and Box obj");
        System.out.println("___________________________");

        PenInterface2 pen2 = new Box();

        pen2.close();
        pen2.open();
    }
}
