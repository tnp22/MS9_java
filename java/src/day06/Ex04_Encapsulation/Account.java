package day06.Ex04_Encapsulation;

public class Account {

	private String deposit;
	private int depositor;
	private String deponumber;
	private String bank;

	public Account() {
		this("예금주 없음", 0, "000000-00-000000", "은행없음");
	}

	public Account(String deposit, int depositor, String deponumber, String bank) {
		this.deposit = deposit;
		this.depositor = depositor;
		this.deponumber = deponumber;
		this.bank = bank;
	}

	public String getDeposit() {
		return deposit;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

	public int getDepositor() {
		return depositor;
	}

	public void setDepositor(int depositor) {
		if (depositor < 0) {
			return;
		}
		this.depositor = depositor;
	}

	public String getDeponumber() {
		return deponumber;
	}

	public void setDeponumber(String deponumber) {
		this.deponumber = deponumber;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "Account [deposit=" + deposit + ", depositor=" + depositor + ", deponumber=" + deponumber + ", bank="
				+ bank + "]";
	}

}
