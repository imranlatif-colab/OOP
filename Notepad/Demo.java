class Demo {
    void show(int x,double y) {
        System.out.println("float version");
    }
    void show(double x, double y) {
        System.out.println("double version");
    }

    public static void main(String[] args) {
         new Demo().show(10.5,20); //  Ambiguous: int → float OR double
    }
}
