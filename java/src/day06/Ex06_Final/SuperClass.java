package day06.Ex06_Final;

public class SuperClass {
	public final void finalMethod() {
		System.out.println("final 메소드 입니다.");
	}
}
class SubClass extends SuperClass{
	/*@Override
	public void finalMethod() {
		System.out.println("final 메소드는 오버라이딩 불가");
	}*/
	public static void main(String[] args) {
		System.out.println("!@#$%^&*()");
	}
}