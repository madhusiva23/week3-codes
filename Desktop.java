package week3.day1.assignments;

public class Desktop extends Computer{

	public void desktopSize(){
		System.out.println("15.6 inches");
	}
	public static void main(String[] args) {
		Desktop desk=new Desktop();
		desk.computerModel();
		desk.desktopSize();

	}

}
