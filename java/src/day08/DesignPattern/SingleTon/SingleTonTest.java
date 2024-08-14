package day08.DesignPattern.SingleTon;

public class SingleTonTest {

	public static void main(String[] args) {
		
		SingleTon s01 = SingleTon.getInstance();
		SingleTon s02 = SingleTon.getInstance();
		
		System.out.println("s01과 s02가 같은지 여부");
		System.out.println(s01==s02);
	}
}
