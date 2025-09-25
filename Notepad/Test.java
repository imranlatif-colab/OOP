    class MyClass {
        private int x;
        private String name;
		static String name2="Comsats";

        // Constructor with two parameters
        public MyClass(int x, String name) {
            this.x = x;
            this.name = name;
			System.out.println("First");
        }

        // Constructor with one parameter, chaining to the two-parameter constructor
        public MyClass(String name) {
			
            this(0, name); // Calls the MyClass(int x, String name) constructor with a default x value
			System.out.println("Second");	
        }
		public MyClass() {
             System.out.println("Third"); // Calls the MyClass(int x, String name) constructor with a default x value
        }
		public String toString() {
        //return "Car [id=" + x + ", name=" + name + "]";
		return String.format("Car [id=" + x + ",Car name=" + name + "]");
    }
    }
	
	public class Test{
	public static void main(String args[]){
	 MyClass m1=new MyClass();
	 MyClass m2=new MyClass("Faisal");
	 System.out.println(m1);
	 //System.out.println(MyClass.name2);
	}
	
	}