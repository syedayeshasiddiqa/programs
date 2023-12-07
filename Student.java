// Chaining Constructors ----> calling one constructor from another constructor
class Student {

	String name;				 										
	int rollNo;															
	String collegeName;													
	String collegeLocation;       										
	String dept;														
	String gender;	
	
	public Student(String dept, String gender, int rollNo){
		this.dept = dept;
		this.gender = gender;
		this.rollNo = rollNo;
	}

	public Student(String collegeName, String collegeLocation){
		this("ECE","Female",8);
		this.collegeName = collegeName;
		this.collegeLocation = collegeLocation;
	}

	public Student(String name){
		this("Ashoka Women's Engg clg","Kurnool");
		this.name = name;
	}
}

public class Test{
	public static void main(String[] args){   
		Student s1 = new Student("Ayesha");
		System.out.println(s1.name);  // null
		System.out.println(s1.collegeName); // null
		System.out.println(s1.collegeLocation); // null
		System.out.println(s1.rollNo);  // 8
		System.out.println(s1.gender); // Female
		System.out.println(s1.dept); // ECE

	}
}
