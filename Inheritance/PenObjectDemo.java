package Interface;

public class PenObjectDemo {
    public static void main(String[] args) {
        System.out.println("Pen obj and Pen Class");
        System.out.println("_____________________");

        Pen pen = new Pen();

        System.out.println(pen.color);
        System.out.println(pen.length);
        pen.open();
        pen.close();
        pen.write();
    }
}
