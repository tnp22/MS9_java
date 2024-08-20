package day09.Ex06.UserException;

public class AccountTest {
	public static void main(String[] args){
		Account account = new Account();
		
		account.deposit(10000);
		
		try {
			account.withdraw(1000000000);
		} catch (BalanceException e) {
			e.printStackTrace();
		}
	}

}
