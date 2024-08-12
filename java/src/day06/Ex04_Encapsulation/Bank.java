package day06.Ex04_Encapsulation;

public class Bank {
	public static void main(String[] args) {
		Account account = new Account("김조은", 0, "282401-04-109955", "국민은행");

		account.setDepositor(10000);

		int money = account.getDepositor();
		System.out.println("예금액 : " + money);
		System.out.println(account);

	}
}
