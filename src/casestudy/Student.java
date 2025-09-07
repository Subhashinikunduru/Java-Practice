package casestudy;

public class Student {
	int rollNo;
	String name;
	String grade;

	public Student(int rollNo, String name, String grade) {
		this.rollNo = rollNo;
		this.name = name;
		this.grade = grade;
	}
	public void displayDetails() {
		System.out.println("Rollno:" + rollNo + ", Name: " + name + ", Grade:" + grade);
	}
	public static void displayDetailsFormat(Student[] students) {
		System.out.println("Roll No\tName\tGrade");
		for(Student student : students) {
			System.out.println(student.rollNo + "\t" + student.name + "\t" + student.grade);
		}
	}
}
	
	//RegistrationForm class
	class RegistrationForm{
		String name;
		int age;
		String gender;
		
		public RegistrationForm(String name,int age, String gender) {
			this.name=name;
			this.age=age;
			this.gender=gender;
		}
		public void displayDetails() {
			System.out.println("Name: " + name + ", Age: " + age + ", Gender:" + gender);
		}
	}
	  class StudentRegistrationApp{
		public static void main(String[] args) {
			Student student1 = new Student(1,"Subbu","A");
			Student student2 = new Student(2,"Teja","B");
			Student student3 = new Student(3,"Paddu","C");
			
			RegistrationForm registrationForm = new RegistrationForm("Subbu" , 20, "Female");

	      	System.out.println("Student Details:");
			Student.displayDetailsFormat(new Student[] {student1,student2, student3});
			
			System.out.println("\nRegistration Form Details:");
			registrationForm.displayDetails();
	}

}

