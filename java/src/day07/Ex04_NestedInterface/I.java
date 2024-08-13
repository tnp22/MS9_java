package day07.Ex04_NestedInterface;

//아우터 클래스

public class I {
	J j;
	
	public void setInterface(J j) {
		this.j = j;
	}
	
	static interface J{
		void methodA();
		void methodB();
	}
	void method() {
		j.methodA();
		j.methodB();
	}
	
}
