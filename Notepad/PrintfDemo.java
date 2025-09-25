public class PrintfDemo {
    public static void main(String[] args) {
        int num = 42;
        double pi = 3.14159;
        char letter = 'A';
        boolean flag = true;

        System.out.printf("Integer: %d%n", num);        // prints Integer: 42
        System.out.printf("Double: %.2f%n", pi);          // prints Double: 3.141590
        System.out.printf("Double (2 decimals): %.2f%n", pi); // prints Double: 3.14
        System.out.printf("Scientific: %e%n", pi);      // prints Scientific: 3.141590e+00
        System.out.printf("Character: %c%n", letter);   // prints Character: A
        System.out.printf("Boolean: %b%n", flag);       // prints Boolean: true
    }
}