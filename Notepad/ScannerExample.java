import java.util.Scanner; // Import the Scanner class

public class ScannerExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console (System.in)
        Scanner inputScanner = new Scanner(System.in);

		
		 // Read an Integer
        System.out.print("Enter your age: ");
        int age = inputScanner.nextInt(); // Reads the next integer token
        
		// Read a String
        System.out.print("Enter your name: ");
        String name = inputScanner.nextLine(); // Reads the entire line of input
       

        // Consume the leftover newline character after nextInt()
        // This is important if you plan to use nextLine() immediately after nextInt()
       // inputScanner.nextLine(); 

        // Read a Double
      /*  System.out.print("Enter your height (in meters): ");
        double height = inputScanner.nextDouble(); // Reads the next double token

        // Consume the leftover newline character after nextDouble()
        inputScanner.nextLine(); 

        // Read a single character
        System.out.print("Enter your initial: ");
        char initial = inputScanner.next().charAt(2); // Reads the next token and gets its first character
		*/
        // Output the collected information
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
     //  System.out.println("Height: " + height + "m");
    //   System.out.println("Initial: " + initial);

        // Close the scanner object to release system resources
        inputScanner.close();
    }
}