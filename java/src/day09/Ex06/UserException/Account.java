package day09.Ex06.UserException;

import lombok.Getter;

@Getter
public class Account {
	private long money;

	public Account() {
		this.money = 1000000;
	}
	
	public void deposit(int money) {
		this.money +=money;
	}
	public void withdraw(int money) throws BalanceException {//예외 전가
		if(this.money<money) {
			// 예외 강제 발생
			// - throw new ???Exception();
			throw new BalanceException("잔고가 부족합니다."+(money-this.money)+"원이 부족합니다.");
		}
		this.money-=money;
	}	
}
