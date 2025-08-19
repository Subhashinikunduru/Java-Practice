package casestudy;

public class StudentDetails {

	private int age;
	private String sname;
	private int rollno;
	private double gpa;

	public StudentDetails(int age, String sname, int rollno, double gpa) {
		setAge(age);
		setSname(sname);
		setRollno(rollno);
		setGpa(gpa);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("Invalid age.Age must be grater than 0.");
		}
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		if (gpa >= 0.0 && gpa <= 10.0) {
			this.gpa = gpa;
		} else {
			System.out.println("Invalid gpa.Gpa must be between 0.0 and 10.0");
		}
	}

	public void displayInfo() {
		System.out.println("Age:" + age);
		System.out.println("Name:" + sname);
		System.out.println("RollNumber:" + rollno);
		System.out.println("GPA:" + gpa);
	}

	public static void main(String[] args) {
		StudentDetails s = new StudentDetails(22, "abcd", 1, 10);
		s.displayInfo();

	}

}
