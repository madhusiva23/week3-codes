package week3.day1.assignments;

public class Student extends Department {
	public void studentName() {
		System.out.println("STUDENT name ");
	}

	public void studentDept() {
		System.out.println("STUDENT dept");
	}

	public void studentID() {
		System.out.println("STUDENT ID");
	}

	public static void main(String[] args) {
		Student stud = new Student();
		stud.studentDept();
		stud.studentID();
		stud.studentName();
		stud.deptName();
		stud.collegeCode();
		stud.collegeName();
		stud.collegeRank();

	}

}
