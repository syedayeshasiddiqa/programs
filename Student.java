// Chaining Constructors ----> calling one constructor from another constructor
class Student {

	String name;				 										// 1 byte
	int rollNo;															// 1 byte
	String collegeName;													// 1 byte
	String collegeLocation;       										// 1 byte
	String dept;														// 1 byte
	String gender;	
	
	public Student(String dept, String gender, int rollNo){
		this.dept = dept;
		this.gender = gender;
		this.rollNo = rollNo;
	}

	public Student(String collegeName, String collegeLocation){
		this("ECE", "Female", 18);
		this.collegeName = collegeName;
		this.collegeLocation = collegeLocation;
	}

	public Student(String name){
		this("Ashoka Women's College", "Dupadu"); // line of code 
		this.name = name;
	}
}

public class Test{
	public static void main(String[] args){   
		Student s1 = new Student("Haritha");
		System.out.println(s1.name);  // Haritha
		System.out.println(s1.collegeName); // null
		System.out.println(s1.collegeLocation); // null
		System.out.println(s1.rollNo);  // 0
		System.out.println(s1.gender); // null
		System.out.println(s1.dept); // null

	}
}