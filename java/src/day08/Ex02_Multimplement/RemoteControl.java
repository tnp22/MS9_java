package day08.Ex02_Multimplement;

public interface RemoteControl {

	//상수
	//최저 속력, 최고 속력 상수를 선언
	// *인터페이스는 변수 선언시, (public static final)이 자동으로 선언된다.
	
	int MAX_Volume =300;
	int MIN_Volume = 0;
	
	void turnOn();
	void turnOff();
	void setVolumen(int volume);
	void setChannel(int channel);
	
	//디폴트 메소드
	// : 구현한 객체가 오버라이딩하지 않아도 기본으로 사용할 수 있는 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("음소거 설정되었습니다.");
			setVolumen(MIN_Volume);
		}
		else {
			System.out.println("음소거 해제되었습니다.");
			setVolumen(10);
		}
	}
	
	//static 메소드
	// : 구현 객체가 없어도 인터페이스만으로 호출이 가능한 메소드
	static void changeBattery() {
		System.out.println("배터리를 교체하였습니다.");
	}
}
