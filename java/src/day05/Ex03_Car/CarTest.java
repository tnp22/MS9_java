package day05.Ex03_Car;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.setModel("제네시스");
		car.setSpeed(100);
		System.out.println(car.getModel());
		System.out.println(car.getSpeed());

		
		car.setSpeed(200);
		System.out.println(car.getSpeed());
		car.setSpeed(-1);
		System.out.println(car.getSpeed());
		car.setSpeed(400);
		System.out.println(car.getSpeed());
	}
}
