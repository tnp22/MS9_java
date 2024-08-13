package day07.Ex02_Interface;

public class Driver {
	public static void main(String[] args) {
		//인터페이스를 구현한 클래스 객체를 만드는 법
		// - 인터페이스타입 객체명 = new 구현클래스();
		
		RemoteControl carRc = new RcCar();
		carRc.turnOn();
		
		carRc.parking(false);
		carRc.setSpeed(20);
		carRc.parking(true);
		carRc.turnOff();
		System.out.println();
		
		RemoteControl.changeBattery();
		System.out.println();
		
		RemoteControl droneRc =new Drone();
		droneRc.turnOn();
		droneRc.parking(false);
		droneRc.setSpeed(15);
		droneRc.parking(true);
		droneRc.turnOff();
		System.out.println();
		
	}
}
