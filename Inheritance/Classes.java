package Inheritance;

class Pen implements PenInterface, PenInterface2 {
    String color = "Black";
    String inkColor = "Blue";
    String length = "6cm";

    public void open() {
        System.out.println("The pen has been opened");
    }

    public void close() {
        System.out.println("The pen has been closed");
    }

    public void write() {
        System.out.println("The pen is writing");
    }
}

class Box extends Pen implements PenInterface, PenInterface2,
      BoxInterface, BoxInterface2
{
    String color = "Red color Box";
    String length = "10cm";
    String height = "5cm";

    public void close() {
        System.out.println("Box closed");
    }

    public void store() {
        System.out.println("Box is storing");
    }

    public void open() {
        System.out.println("Box is now open");
    }
}

class Bag extends Box implements PenInterface, PenInterface2,
      BoxInterface, BoxInterface2, BagInterface
{
    String color = "Grey color bag";
    String capacity = "Large capacity";

    public void open() {
        System.out.println("The bag is now open");
    }

    public void close() {
        System.out.println("Bag is closed");
    }

    public void store() {
        System.out.println("The bag is storing books");
    }
}
