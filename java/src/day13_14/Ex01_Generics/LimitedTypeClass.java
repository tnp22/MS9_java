package day13_14.Ex01_Generics;

class X {}

class A extends X{}
class B extends A{}
class C extends A{}

class D <T extends A>{
	private T t;
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

// * Number 클래스 타입 매개변수로 사용가능하도록 제한
// (Integer, Double 등 숫자타입 클래스만 사용하도록 제한)
class E <T extends Number>{
	private T t;
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t=t;
	}
}

public class LimitedTypeClass {
	public static void main(String[] args) {
		D<A> d1 = new D<A>();
		D<B> d2 = new D<B>();
		D<C> d3	= new D<C>();
		//(에러)D<X> d4 = new D<X>();
		// D 클래스는 타입 매개변수를 A 클래스로 제한하고 있기 때문에,
		// X 클래스로 타입 매개변수 지정 불가
		// A,B,C 클래스는 타입 매개변수로 지정 가능
		
		d1.setT(new A());
		d2.setT(new B());
		d3.setT(new C());
		
		d1.setT(new B()); //B의 부모클래스인 A클래스로 업 캐스팅
		d1.setT(new C()); //C의 부모클래스인 A클래스로 업 캐스팅
		
		// d2<B>, d3<c> <-- 부모 객체인 A 대입불가
		d2.setT((B) new A()); //부모 클래스 객체라서
		//d3.setT(new A()); // err
		
		// * 타입 지정을 생략한경우,
		//제네릭 타입을 제한한 A 클래스를 기본으로 생성된다.
		D d5 = new D();		//D<A> d5 =new D<A>();
		d5.setT(new B());
		d5.setT(new C());
		
		E<Integer> e1 = new E<Integer>();
		E<Double> e2 = new E<Double>();
		E<Byte> e3 = new E<Byte>();
		//E<Boolean> e4 = new E<Boolean>(); //오류 : 숫자타입 아님
		
		
		e1.setT(100);
		System.out.println(e1.getT());
		
		e2.setT(12.34);
		System.out.println(e2.getT());
		
		// 그냥 쓴 정수는 (127) int 타입으로 인식 4byte
		// e3 객체에서 지정한 타입은 Byte (1byte) 이기 때문에 강제 형변환이 필요하다.
		//e3.setT(127);
		System.out.println(e3.getT());
	}
}
