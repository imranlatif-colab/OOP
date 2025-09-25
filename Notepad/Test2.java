class Calculator {
    int value;

    Calculator(int value) {
        this.value = value;
    }

    // Method that accepts object and returns a new object
    Calculator add(Calculator c) {
        return new Calculator(this.value + c.value);
    }
}

public class Test2 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator(10);
        Calculator c2 = new Calculator(20);

        Calculator c3 = c1.add(c2); // Passing c2, returning new object

        System.out.println("Result: " + c3.value); // 30
    }
}
