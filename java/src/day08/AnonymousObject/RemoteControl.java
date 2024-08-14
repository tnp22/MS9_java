package day08.AnonymousObject;

public interface RemoteControl {

	//상수
	//최저 속력, 최고 속력 상수를 선언
	// *인터페이스는 변수 선언시, (public static final)이 자동으로 선언된다.
	
	int MAX_SPEED =300;
	int MIN_SPEED = 0;
	
	void turnOn();
	void turnOff();
	void setSpeed(int speed);
	
	//디폴트 메소드
	// : 구현한 객체가 오버라이딩하지 않아도 기본으로 사용할 수 있는 메소드
	default void parking(boolean check) {
		if(check) {
			System.out.println("주차");
			setSpeed(MIN_SPEED);
		}
		else {
			System.out.println("주행");
			setSpeed(MAX_SPEED);
		}
	}
	
	//static 메소드
	// : 구현 객체가 없어도 인터페이스만으로 호출이 가능한 메소드
	static void changeBattery() {
		System.out.println("배터리를 교체하였습니다.");
	}
}
