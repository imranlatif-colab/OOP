class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class CircleFactory {
    // Method that returns a Circle object
    Circle createCircle(double r) {
        return new Circle(r);
    }
}

public class Test1 {
    public static void main(String[] args) {
        CircleFactory factory = new CircleFactory();
		//Circle c1=new Circle();
        // Factory method returns an object
        Circle c = factory.createCircle(5);

        System.out.println("Area of circle: " + c.area());
    }
}
