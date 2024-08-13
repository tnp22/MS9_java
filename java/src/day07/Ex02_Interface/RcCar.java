package day07.Ex02_Interface;

public class RcCar implements RemoteControl {
	
	int speed;
	
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("RC카 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("RC카 전원을 끕니다.");		
	}

	@Override
	public void setSpeed(int speed) {
		// TODO Auto-generated method stub
		if(speed>RemoteControl.MAX_SPEED) {
			this.speed=RemoteControl.MAX_SPEED;
			System.err.println("최대 속력!");
		}
		else if(speed<RemoteControl.MIN_SPEED) {
			this.speed=RemoteControl.MIN_SPEED;
			System.err.println("최저 속력!");
		}
		else
			this.speed=speed;
		System.out.println("현재 속도 : "+this.speed);
	}
	
}
