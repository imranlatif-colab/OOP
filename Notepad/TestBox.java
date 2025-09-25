class Box {
    double length;

    // Constructor with int parameter
    Box(int l) {
        length = l;
        System.out.println("Constructor with int: " + l);
    }

    // Constructor with double parameter
    Box(double l) {
        length = l;
        System.out.println("Constructor with double: " + l);
    }
}

public class TestBox {
    public static void main(String[] args) {
        Box b1 = new Box(10);     // Calls int constructor
        Box b2 = new Box(10.5);   // Calls double constructor
    }
}
