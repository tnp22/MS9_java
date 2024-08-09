package day05.Ex03_Car;

public class Car {

	private String model;
	private int speed;

	public Car() {
	}

	public Car(String model) {
		this.model = model;
		this.speed = 1000;
	}

	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			//syserr : 컨트롤 +스페이스
			System.err.println("속도는 음수가 될 수 없습니다.");
		} else if (speed > 300) {
			
			System.err.println("최대 속도 제한 입니다.");
			this.speed = 300;
		} else {
			this.speed = speed;
		}
	}

}
