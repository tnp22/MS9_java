package day09.Ex07_Review.추상클래스;

public class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("Desktop - display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop - typing");
	}
}
