class Student {
	int StdId=99;
	int marks;
public static void main (String args[]){
	//System.out.println("Welcome.");
	
	Student s=null;
	System.out.println(s);
	//int marks=50;
	//System.out.println(marks);
	Student s1=new Student();
	Student s2=new Student();
	s1.StdId=100;	s2.StdId=200;
	System.out.println(s1.StdId);
	System.out.println(s2.StdId);
	//s1.print();
	}
	void print(){
		System.out.println(StdId+" "+marks);
	}
}