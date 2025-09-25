// Component class
class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println("Engine of type " + type + " is starting.");
    }
}

// Owner class using composition
class Car {
    private Engine engine; // Car "has-an" Engine

    public Car(String engineType) {
        this.engine = new Engine(engineType); // Composition: Engine is created and owned by Car
    }

    public void startCar() {
        System.out.println("Car is starting.");
        engine.start(); // Delegate the task of starting the engine to the Engine object
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("V6");
        myCar.startCar();
    }
}