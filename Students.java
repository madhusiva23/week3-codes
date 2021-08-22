package week3.day1.assignments;

public class Students {
	public void studentInfo() {
		System.out.println("student info -no param");
	}

	public void studentInfo(String id) {
		System.out.println("with param id - " + id);
	}

	public void studentInfo(int id, String name) {
		System.out.println("ID and name: " + id + ", " + name);
	}

	public void studentInfo(String email, long phone) {
		System.out.println("email: " + email);
		System.out.println("phone num: " + phone);
	}

	public static void main(String[] args) {
		Students stud = new Students();
		stud.studentInfo();
		stud.studentInfo("ID");
		stud.studentInfo(123, "Madhu");
		stud.studentInfo(123, "Joey");
		stud.studentInfo("abs@jm.com", 143324134L);
	}
}
