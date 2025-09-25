class TestCons {
    // Constructor with int parameter
    TestCons(int a) {
        System.out.println("int constructor");
    }

    // Constructor with float parameter
    TestCons(float b) {
        System.out.println("float constructor");
    }
	 TestCons(double b) {
         System.out.println("double constructor");
     }

    public static void main(String[] args) {
        // Creating object with '10' (which is int by default)
        TestCons obj1 = new TestCons(10);   // Matches int constructor 

        // Creating object with '10.5f' (float literal)
        TestCons obj2 = new TestCons(10.5f); // Matches float constructor ✔

        // Creating object with '10.5' (double literal by default)
        TestCons obj3 = new TestCons(10.5);  // Ambiguity – double can convert to both int and float
    }
}
