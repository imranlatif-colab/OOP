class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(name + " has " + marks + " marks.");
    }
}

class TestObject {
    // Method that accepts an object as a parameter
    void updateMarks(Student s) {
        s.marks += 10; // increases marks by 10
    }

    public static void main(String[] args) {
        Student st = new Student("Ali", 80);

        TestObject t = new TestObject();
        t.updateMarks(st); // Passing object

        st.display();  // Ali has 90 marks.
    }
}
