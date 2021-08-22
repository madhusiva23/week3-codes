package week3.day1.assignments;

public class MyBank {

	public static void main(String[] args) {

		System.out.println("-------------------BANK INFO----------");
		BankInfo bank = new BankInfo();
		bank.deposit();
		bank.saving();
		bank.fixed();
		System.out.println("----AXIS-----");
		AxisBank axis = new AxisBank();
		axis.deposit();

	}

}
